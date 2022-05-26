package lesson7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: ");

        Plane1.Wing wingPlane = new Plane1.Wing();
        wingPlane.setWingWeight(1200.2);
        wingPlane.printInfo1();

        System.out.println("Задание 2: ");

        Plane plane = new Plane();
        System.out.println(plane.wing1.printInfo());
        System.out.println(plane.wing2.printInfo());
    }
}
