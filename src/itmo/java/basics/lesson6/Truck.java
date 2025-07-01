package itmo.java.basics.lesson6;

public class Truck extends Car {
    public int wheels;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight){
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }
    public void newWheels(int newWheelsCount){
        this.wheels = newWheelsCount;
        System.out.println("новое количество колес: " + wheels);
    }
}

