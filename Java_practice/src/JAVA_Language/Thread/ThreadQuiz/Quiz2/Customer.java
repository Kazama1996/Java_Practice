package JAVA_Language.Thread.ThreadQuiz.Quiz2;

public class Customer implements Runnable {

    Bank bank;

    public Customer(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = 0; i < 3; i++) {
            bank.deposit(1000);
        }
    }

}
