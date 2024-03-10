package com.github.giandemanincor.javacore.Minterfaces.test;

import com.github.giandemanincor.javacore.Minterfaces.domain.DataBaseLoader;
import com.github.giandemanincor.javacore.Minterfaces.domain.DataLoader;
import com.github.giandemanincor.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();

        //starting permission check with default method
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        // static methods
        DataBaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
