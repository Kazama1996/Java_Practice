package JAVA_Language.Thread.ThreadCommunication.Quiz;

public class Producer implements Runnable {

    private Clerk clerk;

    public Producer(Clerk clerk) {
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
            System.out.println("生產者開始生產商品....");
            clerk.addProduct();
        }
    }

}
