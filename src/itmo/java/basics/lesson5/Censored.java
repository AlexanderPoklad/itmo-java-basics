package itmo.java.basics.lesson5;


//задание 3


public class Censored {
    public static void main(String[] args) {
        String text = "Автомобиль практически не использовался бяка и хранился большую часть времени в гараже.";
        String censoredText = censorBannedWord(text);
        System.out.println(censoredText);
    }

    public static String censorBannedWord(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }
}

