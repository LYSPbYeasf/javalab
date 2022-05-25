package lesson6_4;

import java.util.Scanner;

public class Parent {
    public int number;

    public void inputNumber() {
        System.out.println("Введите целое число: ");
        Scanner intNumber = new Scanner(System.in);
        number = intNumber.nextInt();
    }
    public int getNumber(){
        return number;
    }
}
