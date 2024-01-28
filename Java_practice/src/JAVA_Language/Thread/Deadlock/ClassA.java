package JAVA_Language.Thread.Deadlock;

public class ClassA {

    public synchronized void foo(ClassB b) {
        System.out.println("目前Thread名稱 : " + Thread.currentThread().getName() + "進入 A 實例foo方法");

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("目前Thread名稱 : " + Thread.currentThread().getName() + "企圖呼叫B實例的last方法");
        b.last();
    }

    public synchronized void last() {
        System.out.println("進入ClassA 的 last方法");
    }
}
