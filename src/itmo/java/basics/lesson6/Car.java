package itmo.java.basics.lesson6;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {}
}

//public class Main{
//    public static void main(String[] args) {
//    }
//
//    public static void truckInfo(){
//        Truck truck = new Truck(5000, "Volvo", "Black", 100, 6, 15000);
//        truck.outPut();
//        System.out.println("Количество колес: " + truck.wheels);
//        System.out.println("Максимальный вес: " + truck.maxWeight);
//
//        truck.newWheels(12);
//    }
//}
