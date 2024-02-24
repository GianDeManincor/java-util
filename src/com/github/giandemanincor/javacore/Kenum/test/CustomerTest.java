package com.github.giandemanincor.javacore.Kenum.test;

import com.github.giandemanincor.javacore.Kenum.domain.Customer;
import com.github.giandemanincor.javacore.Kenum.domain.CustomerType;
import com.github.giandemanincor.javacore.Kenum.domain.PaymentType;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Gian", CustomerType.PERSON_ACCOUNT);
        Customer customer2 = new Customer("Gian LTDA", CustomerType.BUSINESS_ACCOUNT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
    }
}
