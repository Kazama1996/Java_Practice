package JAVA_Language.Thread.ThreadCommunication;

public class Clerk {
    private int stock = 0;

    public synchronized void addStock() {
        if (stock >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            stock++;
            System.out.println(Thread.currentThread().getName() + "生產了第" + stock + "個產品");
            notify();
        }

    }

    public synchronized void minusStock() {

        if (stock < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "消費了第" + stock + "個產品");
            stock--;
            notifyAll();
        }

    }
}
