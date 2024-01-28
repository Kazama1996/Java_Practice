package JAVA_Language.Thread.ThreadCommunication.Quiz;

public class ConsuerProducerTest {

    public void test01() {
        Clerk clerk = new Clerk();
        Runnable rp1 = new Producer(clerk);
        Runnable rc1 = new Consumer(clerk);

        Thread producer = new Thread(rp1, "生產者 1");
        Thread consumer = new Thread(rc1, "消費者 1");

        producer.start();
        consumer.start();

    }
}
