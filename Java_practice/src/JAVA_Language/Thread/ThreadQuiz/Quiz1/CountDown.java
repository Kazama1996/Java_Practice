package JAVA_Language.Thread.ThreadQuiz.Quiz1;

public class CountDown implements Runnable {

    static int count = 10;

    @Override
    public void run() {

        while (count != 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(count);
            count--;
        }
        System.out.println("新年快樂");

    }

}
