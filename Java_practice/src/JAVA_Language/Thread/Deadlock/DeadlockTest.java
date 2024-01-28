package JAVA_Language.Thread.Deadlock;

public class DeadlockTest {

    public void test01() {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        new Thread(() -> {

            synchronized (s1) {
                s1.append("a");
                s2.append("1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized (s2) {
                    s1.append("b");
                    s2.append("2");
                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }).start();

        new Thread(() -> {

            synchronized (s2) {
                s1.append("c");
                s2.append("3");

                synchronized (s1) {
                    s1.append("d");
                    s2.append("4");
                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }).start();

    }

    public void test02() {
        DeadLock2 dl = new DeadLock2();
        new Thread(dl).start();
        dl.init();

    }
}
