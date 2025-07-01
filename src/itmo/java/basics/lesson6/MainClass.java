package itmo.java.basics.lesson6;

import java.util.Scanner;

public class MainClass {
    protected Scanner scanner;
    public MainClass() {
        scanner = new Scanner(System.in);
    }

    public int getUserAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }

    public String getUserName() {
        System.out.print("Введите ваше имя: ");
        return scanner.next();
    }
}
