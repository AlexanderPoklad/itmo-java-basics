package itmo.java.basics.lesson6;

public class Child extends Parent{
    public Child(int number){
        super(number);
    }
    public void printNumber(){
        System.out.println("число из класса Parent: " + number);
    }
}
