package JAVA_Language.Thread.CreateThread;

public class OddRunnable implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }

}
