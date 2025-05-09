package Threading;

public class Thread_Abstract extends Thread {
    public static void main(String[] args) {
        Thread_Abstract th = new Thread_Abstract();

        // th.start();
        th.run();

        Thread_Abstract th1 = new Thread_Abstract();

        // th1.start();
        th1.run();

        Thread_Abstract th2 = new Thread_Abstract();

        // th2.start();
        th2.run();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
