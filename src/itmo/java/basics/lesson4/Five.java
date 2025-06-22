package itmo.java.basics.lesson4;


//задание 5


import java.util.Arrays;

public class Five {
    public static void main(String[] args){
        int[] ints = {3, -3, 7, 4, 5, 4, 3};
        System.out.println("array = " + Arrays.toString(ints));
        System.out.println(isFive(ints));
    }
    public static boolean isFive(int[] ints){
        return ints.length >= 2 && (ints[0] == 3 || ints[ints.length - 1] == 3);
    }
}
