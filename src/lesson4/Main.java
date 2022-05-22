package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Часть 1:");
//        System.out.println("Задание 1:");
//        Array.lab1();
//
//        System.out.println("Задание 2:");
//        Array.lab2();
//        System.out.println();

//        System.out.println("Задание 3 и 4:");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число:");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число:");
//        int b = scanner.nextInt();
//        System.out.println("Введите третье число:");
//        int c = scanner.nextInt();
//
//        System.out.println("Результат: " + Array.labBool1(a, b, c));
//        System.out.println("Результат: " + Array.labBool2(a, b, c));

//        System.out.println("Задание 5 и 6:");
//        System.out.println("Введите размерность массива целых чисел(Длина массива > 2): ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] array1 = new int[n];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < n; i++) {
//            array1[i] = scanner.nextInt();
//        }
//        System.out.println("Массив: ");
//        for (int elements : array1) {
//            System.out.print(elements + " ");
//        }
//        System.out.println();
//        int num = 3;
//        boolean boolNumber = Array.labBool3(array1, num);
//        System.out.println("Появляется ли число " + num + " как первый и последний элемент массива:" + boolNumber);
//
//        int num1 = 1;
//        int num2 = 3;
//        boolean boolNumber1 = Array.labBool4(array1, num1, num2);
//        System.out.println("Массив содержит число " + num1 + " и число" + num2 + " : " + boolNumber1);

//        System.out.println("Часть 2:");
//        System.out.println("Задание 1:");
//        Array.ifSortArray();

//        System.out.println("Задание 2:");
//        System.out.println("Массив: " + Arrays.toString(Array.inputArray()));
//
//        System.out.println("Задание 3:");
//        Array.arrayFirstLast();

//        System.out.println("Задание 4:");
//        Array.arrayUnique();

        System.out.println("Задание 5:");
        System.out.println("Введите размерность массива целых чисел: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array2));
        Array.mergeSort(array2, n);
        System.out.println("Отсортированный массив: " + Arrays.toString(array2));
    }
}
