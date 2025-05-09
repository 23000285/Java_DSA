package Threading;

public class Thread_Interface implements Runnable {
    public static void main(String[] args) {
        Thread_Interface th = new Thread_Interface();
        Thread thread = new Thread(th);// passing the object of the user defined class
        thread.start();

        Thread_Interface th1 = new Thread_Interface();
        Thread thread1 = new Thread(th1);// passing the object of the user defined class
        thread1.start();

        Thread_Interface th2 = new Thread_Interface();
        Thread thread2 = new Thread(th2);// passing the object of the user defined class
        thread2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
