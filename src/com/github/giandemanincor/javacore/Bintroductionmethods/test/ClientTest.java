package com.github.giandemanincor.javacore.Bintroductionmethods.test;

import com.github.giandemanincor.javacore.Bintroductionmethods.domain.Client;

public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.name = "Gian";
        client1.print();

        Client client2 = new Client();
        client2.name = "Paloma";
        client2.print();
    }
}
