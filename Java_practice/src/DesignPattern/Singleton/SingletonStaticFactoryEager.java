package DesignPattern.Singleton;

public class SingletonStaticFactoryEager {
    private static SingletonStaticFactoryEager instance = new SingletonStaticFactoryEager();
    private static int timer = 0;

    private SingletonStaticFactoryEager() {
    };

    public static SingletonStaticFactoryEager getInstance() {
        return instance;

    }

    public void setTimer() {
        timer++;
    }

    public int getTimer() {
        return timer;
    }

}
