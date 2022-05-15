package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Задание 1:");
//
//        System.out.println("Я");
//        System.out.println("хорошо");
//        System.out.println("знаю");
//        System.out.println("Java.");
//
//        System.out.println("Задание 2:");
//
//        double result1 = (46 + 10) * (10*1.0 / 3);
//        System.out.println(result1);
//        int result2 = (29) * (4) * (-15);
//        System.out.println(result2);
//
//        System.out.println("Задание 3:");
//
//        int number = 10500;
//        double result = (number/(10*1.0))/10;
//        System.out.println(result);
//
//        System.out.println("Задание 4:");
//
//        double num1 = 3.6;
//        double num2 = 4.1;
//        double num3 = 5.9;
//        double result3 = num1 * num2 * num3;
//        System.out.println(result3);

        System.out.println("Задание 5:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа:");
//        int a = ;
//
//        int b = Integer.parseInt(reader.readLine());
//
//        int c = Integer.parseInt(reader.readLine());
        System.out.println(Integer.parseInt(reader.readLine()));
        System.out.println(Integer.parseInt(reader.readLine()));
        System.out.println(Integer.parseInt(reader.readLine()));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите три числа:");
//        int a =  scanner.nextInt();
//        int b =  scanner.nextInt();
//        int c =  scanner.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        System.out.println("Задание 6:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        if ((b % 2 == 0) && (b < 100)) {
            System.out.println("Четное");
        } else if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        }

    }
}
