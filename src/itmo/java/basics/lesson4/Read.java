package itmo.java.basics.lesson4;


//часть 2 задание 2


import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        int[] ints = read();
        printArray(ints);
    }

    private static int[] read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array lenght: ");
        int lenght = scanner.nextInt();
        int[] ints = new int[lenght];

        System.out.println("Numbers of array: ");
        for (int i = 0; i < lenght; i++){
            ints[i] = scanner.nextInt();
        }
        return ints;
    }
    private static void printArray(int[] ints) {
        System.out.print("Result: [");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i < ints.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

