package com.github.giandemanincor.javacore.Kenum.domain;

public enum CustomerType {
    PERSON_ACCOUNT("PA", "Person Account"),
    BUSINESS_ACCOUNT("BA", "Business Account");

    private final String code;
    private final String name;

    CustomerType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
