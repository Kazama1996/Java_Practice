package Concurrency;

import static Concurrency.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(ANSI_BLUE + "Hello from  " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "3 seconds have passed and I'm awake");
    }

}
