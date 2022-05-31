package lesson9;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LabCollections {
    public static Set<Integer> notDuplicate(List<Integer> list) {
        return new HashSet<Integer>(list);
    }

    public static Set<String> notDuplicate1(List<String> list) {

        return new HashSet<String>(list);
    }

    public static void oneAddMillion(List<Integer> list) {
        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }
    }

    public static void searchTime(List<Integer> list) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int j = list.get(random.nextInt(list.size()));
        }
        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println(" На выполнение ушло: " + time + " нс");
    }

}
