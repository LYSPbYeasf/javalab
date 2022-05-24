package lesson6_3;

public class Main {
    public static void main(String[] args) {
       Truck truck = new Truck(6000, "KAMAZ", 'G', 110, 8, 9000);
       truck.outPut();
       truck.newWheels(10);
       truck.outPut();
    }
}
