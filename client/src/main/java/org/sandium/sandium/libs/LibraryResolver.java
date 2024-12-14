package org.sandium.sandium.libs;

import java.lang.foreign.Arena;
import java.lang.foreign.SymbolLookup;
import java.nio.file.Files;
import java.nio.file.Path;

public class LibraryResolver {

    private static final String[] LIBRARY_SEARCH_PATH = new String[] {
        "lib",
        "client/dist/linux/lib",
        "client/dist/windows/lib",
        "dist/linux/lib",
        "dist/windows/lib"
    };

    public static SymbolLookup libraryLookup(NativeLibrary library, Arena libraryArena) {

        String osName = System.getProperty("os.name").toLowerCase();

        String libFileName;
        if (osName.startsWith("linux")) {
            libFileName = library.getLinuxFileName();
        } else if (osName.startsWith("windows")) {
            libFileName = library.getWindowsFileName();
        } else {
            throw new RuntimeException("Unsupported Operating System " + osName);
        }

        for (String libDir : LIBRARY_SEARCH_PATH) {
            Path libPath = Path.of(libDir, libFileName);
            if (Files.exists(libPath)) {
                return SymbolLookup.libraryLookup(libPath, libraryArena);
            }
        }

        throw new RuntimeException("Could not find library " + libFileName);
    }
}
