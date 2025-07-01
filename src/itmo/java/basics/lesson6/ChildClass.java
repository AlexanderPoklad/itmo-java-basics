package itmo.java.basics.lesson6;

public class ChildClass extends MainClass {
    @Override
    public String getUserName() {
        System.out.print("Введите ваше полное имя: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}

