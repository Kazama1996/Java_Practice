package JAVA_Language.Thread.ThreadSafe;

public class WindowTest {

    public void test01() {
        Runnable r1 = new SaleTicket();

        Thread t1 = new Thread(r1, "售票口1");
        Thread t2 = new Thread(r1, "售票口2");
        Thread t3 = new Thread(r1, "售票口3");

        t1.start();
        t2.start();
        t3.start();

    }

    public void test02() {
        Runnable r1 = new SaleTicket();

        Thread t1 = new Thread(r1, "售票口1");
        Thread t2 = new Thread(r1, "售票口2");
        Thread t3 = new Thread(r1, "售票口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
