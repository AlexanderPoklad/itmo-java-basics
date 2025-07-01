package itmo.java.basics.lesson6;

public abstract class Human {
    private String name;
    private String surName;

    public Human(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public abstract void displayInfo();
}