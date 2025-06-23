package itmo.java.basics.lesson5;


//задание 4


public class Search {
    public static void main(String[] args) {
        String mainString = "Hello world";
        String subString = "l";

        int count = search(mainString, subString);
        System.out.println("Количество вхождений: " + count);
    }
    public static int search(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = mainString.indexOf(subString, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += subString.length();
            }
        }
        return count;
    }
}

