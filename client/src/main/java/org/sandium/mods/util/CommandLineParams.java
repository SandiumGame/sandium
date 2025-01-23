package org.sandium.mods.util;

import org.sandium.api.annotation.PostConstruct;
import org.sandium.api.annotation.SystemGroup;

import java.util.HashMap;

@SystemGroup
public class CommandLineParams {

    public static String[] commandLineArgs;

    private HashMap<String, String> args;

    @PostConstruct
    private void init() {
        args = new HashMap<>();

        // -name or --name optional = then value
        for (String arg : commandLineArgs) {
            if (!arg.startsWith("-")) {
                throw new SystemException("Invalid command line argument " + arg);
            }

            String name = arg;
            while(name.startsWith("-")) {
                name = name.substring(1);
            }
            if (name.isEmpty() || name.startsWith("=")) {
                throw new SystemException("Invalid command line argument " + arg);
            }

            String value = null;
            int i = name.indexOf("=");
            if (i > 0) {
                value = name.substring(i+1);
                name = name.substring(0, i);
            }

            args.put(name.toLowerCase(), value);
        }
    }

    @SuppressWarnings("unused")
    public boolean argExists(String name) {
        return args.containsKey(name.toLowerCase());
    }

    public String getStringArg(String name) {
        String value = args.get(name.toLowerCase());
        if (value == null) {
            throw new SystemException("Command line argument " + name + " should have a value. Example " + name + "=<value>");
        }
        return value;
    }

    @SuppressWarnings("unused")
    public int getIntArg(String name) {
        try {
            return Integer.parseInt(getStringArg(name));
        } catch (NumberFormatException e) {
            throw new SystemException("Command line argument " + name + " does not contain an integer value");
        }
    }

    @SuppressWarnings("unused")
    public double getDoubleArg(String name) {
        try {
            return Double.parseDouble(getStringArg(name));
        } catch (NumberFormatException e) {
            throw new SystemException("Command line argument " + name + " does not contain a floating point value");
        }
    }

}
