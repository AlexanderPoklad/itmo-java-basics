package itmo.java.basics.lesson5;


//задание 1


public class Longer {
    public static void main(String[] args) {
        String text = "Автомобиль практически не использовался и хранился большую часть времени в гараже";
        String longer = findLonger(text);
        System.out.println("Самое длинное слово: " + longer);
    }

    public static String findLonger(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split("\\s+");
        String longer = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > longer.length()) {
                longer = word;
            }
        }

        return longer;
    }
}

