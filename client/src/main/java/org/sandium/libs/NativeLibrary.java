package org.sandium.libs;

public enum NativeLibrary {
    GLFW("libglfw.so.3.4", "glfw3.4.dll");

    private final String linuxFileName;
    private final String windowsFileName;

    NativeLibrary(String linuxFileName, String windowsFileName) {
        this.linuxFileName = linuxFileName;
        this.windowsFileName = windowsFileName;
    }

    public String getLinuxFileName() {
        return linuxFileName;
    }

    public String getWindowsFileName() {
        return windowsFileName;
    }
}
