package lesson6.ex3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(6000, "Камаз", 'G', 110, 8, 9000);
        truck.outPut();
        truck.newWheels(10);
        truck.outPut();
    }
}
