package itmo.java.basics.lesson4;


//задание 3 часть 2


public class Method {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 7, 2};
        System.out.print("Array 1: ");
        printArray(array1);

        int[] array2 = methodArray(array1);
        System.out.print("Array 2: ");
        printArray(array2);
    }

    public static int[] methodArray(int[] array) {
        if (array == null || array.length < 1) {
            return array;
        }

        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);

        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        return newArray;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

