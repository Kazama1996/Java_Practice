package JAVA_Language.Java8.factionalInterface;

public class MyFunctionalInterfaceTest {

    public void test01() {
        MyFunctionalInterface<Integer> m = arg -> arg + 100;

        System.out.println(m.method(10));

    }
}
