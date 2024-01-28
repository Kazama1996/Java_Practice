package JAVA_Language.Thread.ThreadQuiz.Quiz2;

public class Bank {

    private double balance;

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        System.out.println(Thread.currentThread().getName() + "存錢 餘額為:" + balance);
    }

}
