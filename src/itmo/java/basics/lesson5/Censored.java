package itmo.java.basics.lesson5;


//задание 3


import java.util.Scanner;

public class Censored {
    public static void main(String[] args) {
        String text = getText();
        String censoredText = censorBannedWord(text);
        System.out.println(censoredText);
    }

    public static String getText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        return scanner.nextLine();
    }

    public static String censorBannedWord(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }
}

