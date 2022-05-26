package lesson6.ex5;


public class Child extends Parent {
    public String firstName;

    @Override
    public void inputField() {
        System.out.println("Введите имя: ");
        firstName = super.scannerN();
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + firstName);
    }

}