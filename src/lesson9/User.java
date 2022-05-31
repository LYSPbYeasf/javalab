package lesson9;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class User {
    private String name;

    public User() {
    }

    public User(String name) {

        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void userPoints(Map<User, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        Set<User> keys = map.keySet();
        for (User user : keys) {
            if (userName.equals(user.getName())) {
                System.out.println("Пользователь: " + userName + " количество очков:" + map.get(user));
                return;
            }
        }
        System.out.println("Пользователя с таким именем нет");
    }


}
