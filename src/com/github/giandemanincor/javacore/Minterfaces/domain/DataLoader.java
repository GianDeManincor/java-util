package com.github.giandemanincor.javacore.Minterfaces.domain;

public interface DataLoader {
    // all interface attributes are static and final
    public static final int MAX_DATA_SIZE = 10;

    // all interface methods are public and abstracts
    public abstract void load();
    default void checkPermission() {
        System.out.println("starting permission check...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("retrieveMaxDataSize method on interface");
    }
}
