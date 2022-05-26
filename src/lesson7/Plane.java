package lesson7;

public class Plane {
    Plane.Wing wing1 = new Plane.Wing(1500.2);
    Plane.Wing wing2 = new Plane.Wing(1700.8);

    public static class Wing {
        private final Double wingWeight;

        public Wing(Double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public String printInfo() {
            return "Вес крыла составляет: " + wingWeight + " кг";
        }

    }
}
