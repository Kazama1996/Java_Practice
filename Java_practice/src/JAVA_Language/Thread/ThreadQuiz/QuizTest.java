package JAVA_Language.Thread.ThreadQuiz;

import JAVA_Language.Thread.ThreadQuiz.Quiz1.CountDown;
import JAVA_Language.Thread.ThreadQuiz.Quiz2.Bank;
import JAVA_Language.Thread.ThreadQuiz.Quiz2.Customer;

public class QuizTest {

    public void test01() {
        Runnable countDown = new CountDown();

        Thread t1 = new Thread(countDown, "計時器");

        t1.start();
    }

    public void test02() {
        Bank b = new Bank();

        Runnable r_customer1 = new Customer(b);
        Runnable r_customer2 = new Customer(b);

        Thread customer1 = new Thread(r_customer1, "c1");
        Thread customer2 = new Thread(r_customer2, "c2");

        customer1.start();
        customer2.start();

    }
}
