package org.sandium.core.libs;

public enum NativeLibrary {
    GLFW("libglfw.so.3.4", "glfw3.4.dll"),
    VULKAN("libvulkan.so.1", "vulkan-1.dll");

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
