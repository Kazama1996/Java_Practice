package JAVA_Language.Thread.ThreadCommunication;

public class ProducerConsumerTest {

    public void test01() {
        Clerk clerk = new Clerk();

        Runnable producer1 = new Producer(clerk);
        Runnable consumer1 = new Consumer(clerk);
        Runnable consumer2 = new Consumer(clerk);

        Thread p1 = new Thread(producer1, "生產者1號");
        Thread c1 = new Thread(consumer1, "消費者1號");
        Thread c2 = new Thread(consumer2, "消費者2號");

        p1.start();
        c1.start();
        c2.start();
    }
}
