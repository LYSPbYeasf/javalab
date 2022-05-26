package lesson6.ex4;

import java.util.Scanner;

public class Child extends Parent {
    public void printNumber() {
        System.out.println("Число равно: " + getNumber());
    }
}