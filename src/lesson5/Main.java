package lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        String str = "Признанный критикой всего мира величайшим эпическим произведением новой европейской литературы";
        System.out.println(LabString.longWord(str));

        System.out.println("Задание 2:");
        String str1 = "Шалаш";
        String str2 = "Город";
        System.out.println("Слово палиндром? " + LabString.isPalindrome(str1));
        System.out.println("Слово палиндром? " + LabString.isPalindrome(str2));

        System.out.println("Задание 3:");
        String str3 = "Замысел эпопеи формировался бяка задолго до начала работы над тем текстом, который известен бяка под названием ";
        System.out.println(LabString.lab1(str3));

        System.out.println("Задание 4:");
        String string1 = "В это же время князь Василий решает женить своего сына Анатоля, надоевшего ему своими выходками и гулянками, на одной из самых богатых и знатных наследниц того времени — Марье Болконской. Василий решает со своим сыном приезжает в имение Болконских Лысые Горы и встречается с отцом будущей невесты.";
        String string2 = "Василий решает";
        System.out.println(LabString.lab2(string1, string2));

        System.out.println("Задание 5:");
        String string3 = "This is a test string";
        System.out.println("The given string is: " + string3);
        System.out.println("The string reversed word by word is: " + LabString.lab3(string3));
    }
}
