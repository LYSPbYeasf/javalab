package lesson11Mnogopotochnost;

public class ThreadTen extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println(i);
        }

    }
}
