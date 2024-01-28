package JAVA_Language.Thread.ThreadCommunication.Quiz;

public class Consumer implements Runnable {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("消費者開始購買商品....");
            ;
            clerk.minusProduct();
        }
    }

}
