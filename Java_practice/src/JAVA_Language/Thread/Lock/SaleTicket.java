package JAVA_Language.Thread.Lock;

import java.rmi.RemoteException;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket implements Runnable {
    static int ticket = 100;

    // 1. 建立 ReentrantLock 的 instance 記住！！！！！ 一定要 static final 不然每新增一個Thread 都會產生一個
    // lock 這樣就不滿足每個Thread 共用一個Lock
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                // 2. ReentrantLock 上鎖
                lock.lock();
                if (ticket > 0) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "售出一張" + " 剩餘張數 : " + ticket);
                } else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 3. ReentrantLock 上鎖

                lock.unlock();

            }

        }
        System.out.println("票賣完了QQ");
    }

}
