package itmo.java.basics.lesson2;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public long sum(long a, long b){
        return a + b;
    }
    public double sum(double a, double b){
        return a + b;
    }

    public double division(int a, int b){
        return (1.0 * a) / b;
    }
    public double division(long a, long b){
        return ((double) a) / b;
    }
    public double division(double a, double b){
        return a / b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }
    public long multiplication(long a, long b){
        return a * b;
    }
    public double multiplication(double a, double b){
        return a * b;
    }

    public int substraction(int a, int b){
        return a - b;
    }
    public long substraction(long a, long b){
        return a - b;
    }
    public double substraction(double a, double b){
        return  a - b;
    }
}
