package itmo.java.basics.lesson4;


//задание 2


public class Number35 {
    public static void main(String[] args) {
        printNumbers3();
        printNumbers5();
        printNumbers35();
    }

    public static void printNumbers3() {
        System.out.println("Делится на 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printNumbers5() {
        System.out.println("\nДелится на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printNumbers35() {
        System.out.println("\nДелится на 3 и 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}



