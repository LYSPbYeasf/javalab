package lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        List <Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(1);
        list1.add(5);
        list1.add(4);
        list1.add(6);
        list1.add(5);
        list1.add(18);
        list1.add(48);
        List <String> list2 = new ArrayList<>();
        list2.add("sun");
        list2.add("one");
        list2.add("sunny");
        list2.add("First");
        list2.add("sun");
        list2.add("sunny");
        System.out.println(list1);
        System.out.println(LabCollections.notDuplicate(list1));
        System.out.println(list2);
        System.out.println(LabCollections.notDuplicate1(list2));

        System.out.println("Задание 2:");
        List <Integer> list3 = new ArrayList<>();
        List <Integer> list4 = new LinkedList<>();
        LabCollections.oneAddMillion(list3);
        LabCollections.searchTime(list3);
        LabCollections.oneAddMillion(list4);
        LabCollections.searchTime(list4);

//      LinkedList - это связный список. Временная сложность поиска (метод get) в связном списке O(n)
//      ArrayList - это "доработанный" массив. Временная сложность поиска (метод get) в массиве O(1)-константа
//      При больших n поиск в LinkedList работает гораздо медленнее, чем в ArrayList
//      (поиск в ArrayList не зависит от n).
//      Чем большее количество раз мы будем применять поиск, тем разница между временем поиска
//      в этих двух коллекциях будет ощутимее.

        System.out.println("Задание 3:");
        User user1 = new User("Eva");
        User user2 = new User("John");
        User user3 = new User("Mari");
        User user4 = new User();
        user4.setName("Lena");
        User user5 = new User();
        user5.setName("Mark");
        User user6 = new User("Katty");

        Map<User, Integer> userMap = new HashMap<>();
        userMap.put(user1, 25);
        userMap.put(user2, 40);
        userMap.put(user3, 15);
        userMap.put(user4, 38);
        userMap.put(user5, 54);
        userMap.put(user6, 62);
        System.out.println("Введите имя пользователя:");
        User.userPoints(userMap);
    }
}
