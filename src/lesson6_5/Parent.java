package lesson6_5;

import java.util.Scanner;

public class Parent {
    int age;
    Scanner scanner = new Scanner(System.in);
    public void inputField() {
        System.out.println("Введите возраст: ");
        age = scanner.nextInt();
    }

    public void printInfo() {
        System.out.println("Возраст: " + age + "лет");
    }

}
