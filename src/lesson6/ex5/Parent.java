package lesson6.ex5;

import java.util.Scanner;

public class Parent {
    int age;
    private Scanner scanner = new Scanner(System.in);

    public void inputField() {
        System.out.println("Введите возраст: ");
        age = scanner.nextInt();
    }

    public String scannerN() {
        return scanner.next();
    }

    public void printInfo() {
        System.out.println("Возраст: " + age + "лет");
    }

}
