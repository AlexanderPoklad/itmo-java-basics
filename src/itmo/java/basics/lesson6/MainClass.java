package itmo.java.basics.lesson6;

import java.util.Scanner;

public class MainClass {
    protected Scanner scanner;
    public MainClass() {
        scanner = new Scanner(System.in);
    }

    public void getUserName() {
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Возраст: " + age);
    }
}
