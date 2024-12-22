package org.sandium;

import org.sandium.loader.ModManager;
import org.sandium.loader.SystemException;

public class Main {

    public static void main(String[] args) throws SystemException {
        Main main = new Main();

        main.init();
        main.run();
        main.terminate();
    }

    private ModManager modManager;
    private Object glfw;

    private void init() throws SystemException {
        modManager = new ModManager();
        modManager.autowireAllSystems();
    }

    private void run() {
    }

    private void terminate() {
        modManager.close();
    }

}