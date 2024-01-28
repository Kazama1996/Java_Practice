package DesignPattern.Singleton;

public class SingletonStaticFactoryLazy {
    private static SingletonStaticFactoryLazy instance = null;
    private static int timer = 0;

    private SingletonStaticFactoryLazy() {
    };

    public static SingletonStaticFactoryLazy getInstance() {
        if (instance == null) {
            instance = new SingletonStaticFactoryLazy();
        }
        return instance;
    }

    public void setTimer() {
        timer++;
    }

    public int getTimer() {
        return timer;
    }

}
