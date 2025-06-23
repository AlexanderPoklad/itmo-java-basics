package itmo.java.basics.lesson5;


//задание 5


public class Reverse {
    public static void main(String[] args) {
        String input = "This is a test string";
        System.out.println(input);

        String reversed = reverseWords(input);
        System.out.println(reversed);
    }
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            reversedString.append(reversedWord);

            if (i != words.length - 1) {
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }
}

