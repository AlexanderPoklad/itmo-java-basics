package itmo.java.basics.lesson3;


//задание 4


public class Tree {
    int age;
    boolean isAlive;
    String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
        this.isAlive = true;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void printInfo() {
        System.out.println("Дерево: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Живое: " + (isAlive ? "Да" : "Нет"));
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree(10, "Дуб");
        tree1.printInfo();

        Tree tree2 = new Tree(5, true, "Сосна");
        tree2.printInfo();

        Tree tree3 = new Tree();
    }
}