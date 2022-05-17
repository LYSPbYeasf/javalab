package lesson3;

public class Tree {
    private String nameTree;
    private int age;
    private boolean alive;

    public Tree(String nameTree, int age) {
        this.nameTree = nameTree;
        this.age = age;
    }

    public Tree(String nameTree, int age, boolean alive) {
        this.nameTree = nameTree;
        this.age = age;
        this.alive = alive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Название:" + nameTree + " Возраст:" + age + " Живое:" + alive;
    }
}



