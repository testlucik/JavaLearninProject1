package com.tekwillacademy.accessmodifiers;

import com.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person cristina = new Person();

        System.out.println(cristina.isRetired);

        cristina.isRetired = true;

        if (cristina.isRetired) {
            System.out.println("Cristina is retired");
        } else
            System.out.println("Cristina is not retired");

        Person eliza = new Person(12345223155L, "Married", "Eliza", true);

        if (eliza.isRetired) {
            System.out.println("Eliza is retired");
        } else
            System.out.println("Eliza is not retired");

        Person marcel = new Person(122265L, "Marcel");

        if (marcel.isRetired) {
            System.out.println("Marcel is retired");
        } else
            System.out.println("Marcel is not retired");

        System.out.println(Person.hasHeart);
        Person.hasBrain = false;
        System.out.println(Person.hasBrain);
    }


}
