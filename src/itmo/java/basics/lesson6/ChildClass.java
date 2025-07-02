package itmo.java.basics.lesson6;

public class ChildClass extends MainClass {
    @Override
    public String getUserName() {
        String parentResult = super.getUserName();
        System.out.print("Введите ваше имя: ");
        String name = scanner.next();
        return parentResult + ", Имя: " + name;
    }
}

