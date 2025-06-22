package itmo.java.basics.lesson4;


//2 часть задание 1


public class Massive {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};

        boolean isSorted = isSort(ints);

        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
    public static boolean isSort(int[] ints) {
        if (ints == null || ints.length <= 1) {
            return true;
        }
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > ints[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
