package JAVA_Language.Thread.Deadlock;

public class DeadLock2 implements Runnable {

    ClassA a = new ClassA();
    ClassB b = new ClassB();

    public void init() {
        Thread.currentThread().setName("主Thread");
        a.foo(b);
        System.out.println("進入主Thread之後");
    }

    @Override
    public void run() {
        Thread.currentThread().setName("副Thread");

        b.bar(a);
        System.out.println("進入副Thread 之後");
    }

}
