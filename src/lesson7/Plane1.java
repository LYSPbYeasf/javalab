package lesson7;

public class Plane1 {
    public static class Wing {
        private Double wingWeight;

        public void setWingWeight(Double wingWeight) {

            this.wingWeight = wingWeight;
        }

        public void printInfo1() {
            System.out.println("Вес крыла составляет: " + wingWeight + " кг");
        }
    }
}
