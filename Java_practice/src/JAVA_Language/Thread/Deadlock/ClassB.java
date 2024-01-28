package JAVA_Language.Thread.Deadlock;

public class ClassB {

    public synchronized void bar(ClassA a) {
        System.out.println("目前Thread名稱 : " + Thread.currentThread().getName() + "進入 B 實例bar方法");

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("目前Thread名稱 : " + Thread.currentThread().getName() + "企圖呼叫A實例的last方法");
        a.last();

    }

    public synchronized void last() {
        System.out.println("進入ClassB 的 last方法");

    }
}
