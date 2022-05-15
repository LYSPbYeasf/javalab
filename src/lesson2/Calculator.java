package lesson2;

public class Calculator {
    int intNum1;
    int intNum2;

    double doubleNum1;
    double doubleNum2;

    long longNum1;
    long longNum2;

    public void sum(int intNum1, int intNum2) {
        int result = intNum1 + intNum2;
        System.out.println("Сумма чисел типа int:" + result);
    }

    public void sum(double doubleNum1, double doubleNum2) {
        double result = doubleNum1 + doubleNum2;
        System.out.println("Сумма чисел типа double:" + result);
    }

    public void sum(long longNum1, long longNum2) {
        long result = longNum1 + longNum2;
        System.out.println("Сумма чисел типа long:" + result);
    }

    public void subtraction(int intNum1, int intNum2) {
        int result = intNum1 - intNum2;
        System.out.println("Разность чисел типа int:" + result);
    }

    public void subtraction(double doubleNum1, double doubleNum2) {
        double result = doubleNum1 - doubleNum2;
        System.out.println("Разность чисел типа double:" + result);
    }

    public void subtraction(long longNum1, long longNum2) {
        long result = longNum1 - longNum2;
        System.out.println("Разность чисел типа long:" + result);
    }

    public void multiplication(int intNum1, int intNum2) {
        int result = intNum1 * intNum2;
        System.out.println("Произведение чисел типа int:" + result);
    }

    public void multiplication(double doubleNum1, double doubleNum2) {
        double result = doubleNum1 * doubleNum2;
        System.out.println("Произведение чисел типа double:" + result);
    }

    public void multiplication(long longNum1, long longNum2) {
        long result = longNum1 * longNum2;
        System.out.println("Произведение чисел типа long:" + result);
    }

    public void division(int intNum1, int intNum2) {
        double result = (1.0 * intNum1) / intNum2;
        System.out.println("Частное чисел типа int:" + result);
    }

    public void division(double doubleNum1, double doubleNum2) {
        double result = doubleNum1 / doubleNum2;
        System.out.println("Частное чисел типа double:" + result);
    }

    public void division(long longNum1, long longNum2) {
        double result = (1.0 * longNum1) / longNum1;
        System.out.println("Частное чисел типа long:" + result);
    }
}
