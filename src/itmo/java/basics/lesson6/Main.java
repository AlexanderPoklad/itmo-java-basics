package itmo.java.basics.lesson6;

//public class Main {
//    public static void main(String[] args) {
//        Demo();
//    }
//
//    private static void Demo() {
//        Human client = new Client("Александр", "Поклад", "Сбер");
//        Human bankEmployee = new BankEmployee("Дарья", "Поклад", "Альфа");
//
//        displayHumanInfo(client);
//        displayHumanInfo(bankEmployee);
//    }
//
//    private static void displayHumanInfo(Human human){
//        human.displayInfo();
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        truckInfo();
//    }
//
//    public static void truckInfo(){
//        Truck truck = new Truck(5000, "Volvo", 'A', 100, 6, 15000);
//        truck.outPut();
//        System.out.println("Количество колес: " + truck.wheels);
//        System.out.println("Максимальный вес: " + truck.maxWeight);
//
//        truck.newWheels(12);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Method();
//
//    }
//    private  static void Method(){
//        int inputNumber = 13;
//        Child child = new Child(inputNumber);
//        child.printNumber();
//    }
//}
public class Main {
    public static void main(String[] args) {

        ChildClass child = new ChildClass();

        int age = child.getUserAge();
        System.out.println("Возраст: " + age);

        String name = child.getUserName();
        System.out.println("Имя: " + name);
    }
}