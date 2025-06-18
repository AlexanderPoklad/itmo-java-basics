package itmo.java.basics.lesson3;


//задание 3


public class House {
    private int floors;
    private int year;
    private String name;

    public void setHouseInfo(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + year);
        System.out.println("Наименование: " + name);
        System.out.println("Количество лет с момента постройки: " + getAge() + " лет");
    }

    public int getAge() {
        return 2025 - year;
    }

    public static void main(String[] args) {

        House dom1 = new House();
        dom1.setHouseInfo(5, 2000, "Дом");

        House dom2 = new House();
        dom2.setHouseInfo(52, 2015, "Дом2");

        dom1.printInfo();
        dom2.printInfo();
    }
}