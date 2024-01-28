package DesignPattern.Singleton;

public class SingletonLazyThreadSafe {
    private static volatile SingletonLazyThreadSafe instance = null;

    private SingletonLazyThreadSafe() {
    };

    public static SingletonLazyThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonLazyThreadSafe();
                }
            }
        }

        return instance;
    }

}
