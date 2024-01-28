package DesignPattern.Singleton;

public class SingletonTest extends Thread {

    String myId;

    public SingletonTest(String id) {
        myId = id;
    }

    @Override
    public void run() {
        super.run();
        SingletonStaticFactoryLazy instance = SingletonStaticFactoryLazy.getInstance();
        if (instance != null) {
            System.out.println("Thread id : " + myId + " Singleton :" + instance.hashCode());
        }

    }

}
