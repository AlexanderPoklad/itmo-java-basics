package itmo.java.basics.lesson6;

public class Client extends Human{
    private String bankName;

    public Client(String name, String surName, String bankName){
        super(name, surName);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo(){
        System.out.println("Клиент: " + getName() + " " + getSurName() + " " + bankName);
    }
}


