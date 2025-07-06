package itmo.java.basics.lesson6;

public class ChildClass extends MainClass {
    @Override
    public void getUserName() {
        super.getUserName();
        System.out.print("Введите ваше имя: ");
        String name = scanner.next();
        System.out.println("Имя: " + name);
    }
}

