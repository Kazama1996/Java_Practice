package JAVA_Language.Thread.CreateThread;

public class ThreadTest {

    public void test01() {
        // Thread t = new EvenThread();

        // t.start();

        // Thread t2 = new OddThread();

        // t2.start();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        });
        t3.start();
        t4.start();

    }

    public void test02() {

        Runnable r1 = new EvenRunnable();

        Thread t1 = new Thread(r1, "Thread 1");

        t1.start();

        Thread.currentThread().setName("Main Thread");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }

            if (i == 20) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Thread 1 是否存活 ??" + t1.isAlive());
        Thread.currentThread();

    }

}
