package itmo.java.basics.lesson4;


//задание 1


public class Numbers {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
    }
}
