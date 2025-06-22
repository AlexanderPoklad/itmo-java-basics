package itmo.java.basics.lesson4;


//задание 6


public class Six {
    public static void main(String[] args) {
        int[] ints = {6, 2, 8, 4, 5, 6};
        boolean isSix = isSix(ints);
        if(isSix){
            System.out.println("Массив содержит 3 или 1");
        }
        else {
            System.out.println("Массив не содержит 3 или 1");
        }
    }
    public static boolean isSix(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            int num = ints[i];
            if (num == 1 || num == 3) return true;
        }
        return false;
    }
}