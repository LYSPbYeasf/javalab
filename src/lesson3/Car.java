package lesson3;

public class Car {
    private String brand;
    private String color;
    private double weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String brand, String color, double weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    public Car() {

    }

    public String printCar(){
        return "Название:" + brand + " Цвет:" + color + " Вес:" + weight;
    }

}
