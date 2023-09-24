package com.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {

    //Class variables
    public static boolean hasHeart = true;
    public static boolean hasBrain;

    //Declaring Person's variables;
    //All below variables will be declared as instance variable, because they define the objects of Person class
    private long idnp;
    String maritalStatus;
    protected String name;
    public boolean isRetired;

    public Person() {
        System.out.println("The object has no parameters declared");
    }

    public Person(long idnp, String name) {
        this.idnp = idnp;
        this.name = name;
        System.out.println("The object with 2 parameters declared has " + name + " name and " + idnp + " idnp");
    }

    public Person(long idpn, String maritalStatus, String name, boolean isRetired) {
        this.idnp = idpn;
        this.maritalStatus = maritalStatus;
        this.name = name;
        this.isRetired = isRetired;
        System.out.println("The object with no parameters declared has " + name + " name, " + idnp + " idnp, marital status set as " + maritalStatus + "  and retired status as " + isRetired);

    }



}
