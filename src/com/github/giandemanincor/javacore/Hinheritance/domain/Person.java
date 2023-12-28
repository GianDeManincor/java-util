package com.github.giandemanincor.javacore.Hinheritance.domain;

public class Person {
    protected String name;
    private String document;
    private Address address;

    public Person(String name, String document, Address address) {
        this.name = name;
        this.document = document;
        this.address = address;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.document);
        if(address == null) return;
        System.out.println(address.getStreet() + " " + address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
