package itmo.java.basics.lesson4;


//задание 3


import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число:");
        int num1 = scanner.nextInt();

        System.out.print("Второе число:");
        int num2 = scanner.nextInt();

        System.out.print("Третье число:");
        int num3 = scanner.nextInt();

        boolean result = isSum(num1, num2, num3);
        System.out.println(result);
    }
    public static boolean isSum(int a, int b, int c){
        return (a + b) == c;
    }
}
