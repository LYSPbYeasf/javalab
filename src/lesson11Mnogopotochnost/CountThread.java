package lesson11Mnogopotochnost;

public class CountThread extends Thread {
    public Counter counter;

    public CountThread(Counter counter) {

        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
