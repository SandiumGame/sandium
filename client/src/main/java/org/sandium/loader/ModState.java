package org.sandium.loader;

public enum ModState {
    CREATED,
    SYSTEM_GROUPS_CONSTRUCTED,
    SYSTEM_GROUPS_AUTOWIRED,
    RUNNING,
    DESTROYING,
    DESTROYED,
    ERROR
}
