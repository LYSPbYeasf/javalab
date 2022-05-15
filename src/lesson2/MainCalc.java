package lesson2;

public class MainCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1, 5);
        calculator.sum(1.3, -6);
        calculator.sum(1000000L, 9000L);
        calculator.subtraction(1, 5);
        calculator.subtraction(1.3, -6);
        calculator.subtraction(1000000L, 9000L);
        calculator.multiplication(1, 5);
        calculator.multiplication(1.3, -6);
        calculator.multiplication(1000000L, 9000L);
        calculator.division(1, 5);
        calculator.division(1.3, -6);
        calculator.division(1000000L, 9000L);
    }
}
