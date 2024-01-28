package JAVA_Language.Thread.ThreadCommunication;

public class Consumer implements Runnable {

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            System.out.println("消費者開始消費產品");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            clerk.minusStock();
        }
    }

}
