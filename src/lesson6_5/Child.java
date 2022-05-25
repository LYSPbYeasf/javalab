package lesson6_5;

public class Child extends Parent {
    String firstName;
    @Override
    public void inputField() {
        System.out.println("Введите имя: ");
        firstName = scanner.nextLine();
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + firstName);
    }

}
