package lesson6_3;

public class Truck extends Car {
    private int numberOfWheels;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }
    public Truck() {

    }

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " , её скорость - " + speed + " , количество колес - " + numberOfWheels + " , максимальный вес - " + maxWeight);
    }

    public void newWheels(int numberOfWheels) {
        if (this.numberOfWheels != 0) {
            this.numberOfWheels = numberOfWheels;
            System.out.println("Количество колес грузовика " + this.model + " изменено на: " + this.numberOfWheels);
        }
    }
}
