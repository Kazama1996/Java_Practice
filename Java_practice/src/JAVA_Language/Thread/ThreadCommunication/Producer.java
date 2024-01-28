package JAVA_Language.Thread.ThreadCommunication;

public class Producer implements Runnable {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            System.out.println("生產者生產一個產品");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            clerk.addStock();
        }
    }
}
