package JAVA_Language.Thread.ThreadCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Print1To100 implements Runnable {

    private static int num = 1;

    @Override
    public void run() {

        while (true) {
            // 剖面 1. 迴圈開始
            synchronized (this) { // 剖面 2. 某個Thread 看到這個區塊需要鎖，於是嘗試搶鎖
                if (num <= 100) {
                    notify();// 剖面 3: 通知另一個Thread 不要再等了 繼續執行

                    System.out.println(Thread.currentThread().getName() + " : " + num);
                    num++;
                    try {
                        wait();// 剖面 4: 執行 wait() 進行等待，直到有人notify()
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else
                    break;

            }
            // 剖面 5: 迴圈結束 回到剖面1

        }

    }

}
