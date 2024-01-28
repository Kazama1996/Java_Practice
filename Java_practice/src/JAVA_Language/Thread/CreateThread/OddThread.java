package JAVA_Language.Thread.CreateThread;

public class OddThread extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

}
