package org.sandium.loader;

public interface SystemGroupResolver {

    ResolvedSystemGroup getSystemGroup(Class<?> systemGroupClass) throws SystemException;

    record ResolvedSystemGroup(LoadedMod mod, Object systemGroup) {
    }
}
