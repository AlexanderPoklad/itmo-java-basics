package itmo.java.basics.lesson5;


//задание 2


public class Palindrome {
    public static void main(String[] args) {
        String word = "Level";
        boolean isPalindrome = isPalindrome(word);

        if (isPalindrome) {
            System.out.println("Слово '" + word + "' является палиндромом");
        } else {
            System.out.println("Слово '" + word + "' не является палиндромом");
        }
    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        int left = 0;
        int right = cleanedWord.length() - 1;

        while (left < right) {
            if (cleanedWord.charAt(left) != cleanedWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

