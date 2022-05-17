package lesson3;

public class Main {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        Car car1 = new Car("BMW", "Black", 3.2);
        Car car2 = new Car("Opel", "Yellow", 2.5);
        System.out.println(car1.printCar());
        System.out.println(car2.printCar());

        House house1 = new House();
        house1.setHouse("ЖК Огни Москвы", 25, 2010);
        House house2 = new House();
        house2.setHouse("ЖК Солнечный город", 8, 2018);
        System.out.println(house1.printHouse());
        System.out.println(house1.howOldHouse() + " лет с момента постройки");
        System.out.println(house2.printHouse());
        System.out.println(house2.howOldHouse() + " лет с момента постройки");

        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Береза",74);
        System.out.println(tree2);
        Tree tree3 = new Tree("Сосна",132, true);
        System.out.println(tree3);
    }
}
