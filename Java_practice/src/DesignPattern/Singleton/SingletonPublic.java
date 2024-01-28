package DesignPattern.Singleton;

public class SingletonPublic {
    public static final SingletonPublic instance = new SingletonPublic();
    private static int timer = 0;

    private SingletonPublic() {
    };

    public void showMessage() {
        System.out.println("Hello public static final");
    }

    public void setTimer() {
        timer++;
    }

    public int getTimer() {
        return timer;
    }
}
