package itmo.java.basics.lesson6;

public class ChildClass extends MainClass {
    @Override
    public String getUserName() {
        System.out.print("Введите ваше полное имя: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
    @Override
    public int getUserAge(){
        System.out.println("Введите ваш полный возраст: ");
        return scanner.nextInt();
    }
}

