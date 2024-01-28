package JAVA_Language.Thread.ThreadCommunication;

public class CommunicationTest {

    public void test01() {

        Runnable r1 = new Print1To100();

        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r1, "Thread 2");

        t1.start();
        t2.start();
    }
}
