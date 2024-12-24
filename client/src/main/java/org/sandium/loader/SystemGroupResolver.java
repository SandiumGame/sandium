package org.sandium.loader;

public interface SystemGroupResolver {

    Object getSystemGroup(Class<?> systemGroupClass) throws SystemException;

}
