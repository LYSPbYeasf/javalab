package lesson11Mnogopotochnost;

public class ThreadName extends Thread {
    private final Object monitor;
    ThreadName(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                synchronized (monitor) {
                    System.out.println(currentThread().getName());
                    monitor.notify();
                    monitor.wait();
                }
            }
        } catch (InterruptedException error) {
            System.out.println("Поток завершен" + getName());
        }
    }
//    @Override
//    public void run() {
//        synchronized (System.out) {
//            int i = 0;
//            while (i < 50) {
//                i++;
//                System.out.println("My name: " + currentThread().getName());
//                System.out.notify();
//                try {
//                    System.out.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}
