package itmo.java.basics.lesson4;

public class FirstUniqueNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4};
        Integer firstUnique = findFirstUnique(numbers);
        System.out.println("Первое уникальное число: " + firstUnique);
    }

    public static Integer findFirstUnique(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return array[i];
            }
        }

        return null;
    }
}



