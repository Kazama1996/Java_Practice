package JAVA_Language.Thread.ThreadCommunication.Quiz;

public class Clerk {
    private int productNum = 0;

    public synchronized void addProduct() {
        if (productNum >= 20) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.productNum++;
        System.out.println(Thread.currentThread().getName() + " 生產了第" + productNum + "個產品");
        notify();
    }

    public synchronized void minusProduct() {

        if (productNum <= 0) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 購買了第" + productNum + "個產品");
        this.productNum--;
        notify();
    }

}
