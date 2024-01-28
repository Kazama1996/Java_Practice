package JAVA_Language.Thread.Lock;

public class LockTest {

    public void test01() {
        Runnable sale = new SaleTicket();

        new Thread(sale).start();
        new Thread(sale).start();
        new Thread(sale).start();

    }
}
