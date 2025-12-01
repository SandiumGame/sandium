package org.sandium.core.loader;

import java.lang.classfile.ClassBuilder;
import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassModel;
import java.lang.classfile.MethodModel;

import java.lang.constant.ClassDesc;
import java.lang.reflect.AccessFlag;
import java.util.HashSet;
import java.util.Set;

public final class ClassValidator {

    public final int MAX_CLASS_FILE_SIZE = 1000000;

    private final Set<String> whitelist;

    public ClassValidator() {
        this.whitelist = new HashSet<>();
    }

    public byte[] validateAndTransform(String name, byte[] classBytes) throws ValidationException {
        if (classBytes.length > MAX_CLASS_FILE_SIZE) {
            throw new ValidationException("Class file %s is bigger then the allowed %d bytes".formatted(name, MAX_CLASS_FILE_SIZE));
        }

        // Parse the class file into the ClassModel (preview API)
        ClassModel classModel = ClassFile.of().parse(classBytes);

        ClassDesc classDesc = ClassDesc.ofInternalName(classModel.thisClass().asInternalName());
        String className = classDesc.packageName()+"."+classDesc.displayName();
        if (!classDesc.isClassOrInterface()) {
            throw new ValidationException("Class %s must be a class or interface".formatted(className));
        }
        return ClassFile.of().build(classDesc, classBuilder -> {
            classBuilder.withInterfaces(classModel.interfaces());
            classModel.methods().forEach(method -> handleMethod(className, classBuilder, method));
        });

        // TODO Fields

        // TODO Method calls
        // TODO   Don't allow invokedynamic
        // TODO   Also scan bootstrap methods
        // TODO Look for field access
        // TODO new (monitor memory consumption), Object pooling?
        // TODO Backward branching
        // TODO synchronized?
        // TODO Recursive method calls?
        // TODO Validate constant pool indices
        // TODO Validate stack map frames
        // TODO Validate attribute structures
        // TODO Validate that instructions have proper operand widths
        // TODO Scan package classes
    }

    private void handleMethod(String className, ClassBuilder classbuilder, MethodModel method) throws ValidationException {
        System.out.println(method.methodName());

        if (method.flags().has(AccessFlag.NATIVE)) {
            throw new ValidationException("Class %s can not have native methods".formatted(className));
        }

        classbuilder.withMethodBody(method.methodName(), method.methodType(), method.flags().flagsMask(), codeBuilder -> {
            if (method.code().isPresent()) {
                method.code().get().forEach(codeElement -> {
                    codeBuilder.with(codeElement);
                });
            }
        });
    }

//    // Helper: produce the canonical whitelist string for a given owner/name/descriptor
//    public static String canonical(String ownerInternalName, String name, String descriptor) {
//        return ownerInternalName + "#" + name + ":" + descriptor;
//    }
}
