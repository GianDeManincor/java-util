package com.github.giandemanincor.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {

    public DataBaseLoader() {
    }

    @Override
    public void load() {
        System.out.println("loading data from database...");
    }

    @Override
    public void remove() {
        System.out.println("removing data from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("starting permission check in DataBaseLoader class");
    }
    public static void retrieveMaxDataSize() {
        System.out.println("retrieveMaxDataSize method on interface");
    }
}
