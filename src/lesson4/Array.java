package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
//    public static void lab1() {
//        for (int i = 1; i < 100; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void lab2() {
//        System.out.println("Делится на 3: ");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("\nДелится на 5: ");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("\nДелится на 3 и на 5: ");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//
//public static boolean labBool1(int a, int b, int c) {
//        return (a + b == c);
//    }
//
//    public static boolean labBool2(int a, int b, int c) {
//        return (b > a && c > b);
//    }
//    public static boolean labBool3(int[] array) {
//        boolean result;
//        result = array[0] == 3 || array[array.length - 1] == 3;
//        return result;
//    }
//
//    public static boolean labBool4(int[] array) {
//        for (int elements : array) {
//            if (elements == 3 || elements == 1) {
//                return true;
//            }
//        }
//        return false;
//    }

//    public static int[] inputArray() {
//        System.out.println("Введите размерность массива целых чисел: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//
//    }
//
//    public static void ifSortArray(int[] array) {
//        boolean result = true;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                System.out.println("Please, try again");
//                return;
//            }
//        }
//        System.out.println("OK");
//    }
//
//    public static void arrayFirstLast(int[] array) {
//        int first = array[0];
//        array[0] = array[array.length - 1];
//        array[array.length - 1] = first;
//        System.out.println("Массив 2:" + Arrays.toString(array));
//    }

//    public static void arrayUnique(int[] array) {
//        for (int element1 : array) {
//            int elementUnique = 0;
//            for (int element2 : array) {
//                if (element1 == element2) {
//                    elementUnique++;
//                }
//            }
//            if (elementUnique == 1) {
//                System.out.println("Первый уникальный элемент в массиве: " + element1);
//                return;
//            }
//        }
//        System.out.println("В массиве нет уникальных элементов");
//
//    }

    public  static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i-mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right,(n - mid));
        merge(array, left, right, mid, (n - mid));

    }
    public static void merge( int[] array, int[] left, int[] right, int left1, int right1) {
        int i = 0, j = 0, k =0;
        while (i < left1 && j < right1) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }
        while (i < left1) {
            array[k++] = left[i++];
        }
        while ( j < right1) {
            array[k++] = right[j++];
        }
    }
}









