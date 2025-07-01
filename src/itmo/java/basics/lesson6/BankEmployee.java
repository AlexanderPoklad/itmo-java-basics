package itmo.java.basics.lesson6;

public class BankEmployee extends Human{
    private String bankName;

    public BankEmployee(String name, String surName, String bankName){
        super(name, surName);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo(){
        System.out.println("Работник банка: " + getName() + " " + getSurName() + " " + bankName);
    }
}
