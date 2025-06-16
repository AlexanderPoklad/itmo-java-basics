package itmo.java.basics.lesson3;

//задание 2

public class Car {
    private String color;
    private String name;
    private double weight;

    public void setCarInfo(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Вес: " + weight);
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("Лада", "Малиновая", 1500);
        car1.printInfo();

        Car car2 = new Car();
        car2.setCarInfo("Лада-седан", "Баклажан", 1500);
        car2.printInfo();
    }
}
