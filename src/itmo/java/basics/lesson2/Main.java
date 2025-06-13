package itmo.java.basics.lesson2;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(2, 3));
        System.out.println(calculator.sum(3L, 4L));
        System.out.println(calculator.sum(3.3, 3.3));

        System.out.println(calculator.division(4, 2));
        System.out.println(calculator.division(6L, 2L));
        System.out.println(calculator.division(8.8, 2));

        System.out.println(calculator.multiplication(2, 2));
        System.out.println(calculator.multiplication(4L, 3L));
        System.out.println(calculator.multiplication(2.2, 4));

        System.out.println(calculator.substraction(6, 4));
        System.out.println(calculator.substraction(8L, 5L));
        System.out.println(calculator.substraction(6.6, 3.3));

        Book defaultBook = new Book();
        defaultBook.printInfo();

        Book book = new Book("название книги", "автор книги", 2025);
        book.printInfo();



    }
}
