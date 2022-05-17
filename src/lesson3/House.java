package lesson3;

import java.util.Calendar;

public class House {
    private String name;
    private int floor;
    private int year;

    public void setHouse(String name, int floor, int year) {
        this.name = name;
        this.floor = floor;
        this.year = year;
    }

    public String printHouse() {
        return "Наименование дома:" + name + " Количество этажей:" + floor + " Год постройки:" + year;
    }

    public int howOldHouse() {
        Calendar calendar = Calendar.getInstance();
        int yearNow = calendar.get(Calendar.YEAR);
        return yearNow - this.year;
    }

}
