package co.edureka.threads;

public class MyThreadDeadlockDemo {
    public static Object lockObjectA = new Object();
    public static Object lockObjectB = new Object();

    public static void main(String args[]) {
        MyThreadClassA threadObjectA = new MyThreadClassA();
        MyThreadClassB threadObjectB = new MyThreadClassB();

        threadObjectA.start();
        threadObjectB.start();
    }

    private static class MyThreadClassA extends Thread {
        public void run() {
            synchronized(lockObjectA) {
                System.out.println("Thread A: Acquired lock A");

                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {}
                System.out.println("Thread A: Waiting for lock B");

                synchronized(lockObjectB) {
                    System.out.println("Thread A: Acquired lock on A and B");
                }
            }
        }
    }

    private static class MyThreadClassB extends Thread {
        public void run() {
            synchronized(lockObjectA) {
                System.out.println("Thread B: Acquired lock B");

                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {}
                System.out.println("Thread B: Waiting for lock A");

                synchronized(lockObjectB) {
                    System.out.println("Thread B: Acquired lock on A and B");
                }
            }
        }
    }
}