package JAVA_Language.Thread.ThreadSafe;

public class SaleTicket implements Runnable {
    static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "售出一張" + " 剩餘張數 : " + ticket);
                } else {
                    break;
                }
            }

        }
        System.out.println("票賣完了QQ");
    }

}
