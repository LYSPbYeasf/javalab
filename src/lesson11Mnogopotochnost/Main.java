package lesson11Mnogopotochnost;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Задание 1, 2 ");
//        for (int i = 0; i < 10; i++) {
//            ThreadTen thread = new ThreadTen();
//            System.out.println(thread.getName() + ":" + thread.getState());
//            thread.start();
//            System.out.println(thread.getName() + ":" + thread.getState());
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(thread.getName() + ": " + thread.getState());
//        }

//        System.out.println("Задание 3 ");
//        Counter counter = new Counter();
//        for (int i = 0; i < 100; i++) {
//            CountThread thread = new CountThread(counter);
//            thread.start();
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("count = " + counter.getCount());

        System.out.println("Задание 4/1 ");
//        ThreadName thread1 = new ThreadName();
//        ThreadName thread2 = new ThreadName();
//        thread1.start();
//        thread2.start();

        System.out.println("Задание 4/2 ");
        Object objectMonitor = new Object();
        try {
            Thread thread3 = new ThreadName(objectMonitor);
            Thread thread4 = new ThreadName(objectMonitor);
            thread3.start();
            thread4.start();
            Thread.sleep(8000);
            thread3.interrupt();
            thread4.interrupt();
        }
        catch (InterruptedException error) {
            error.getStackTrace();
        }
    }
}
