package JAVA_Language.Java8.Lambda;

import java.util.Comparator;

public class LambdaTest {

    public void test01() {
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("aaaaaaa");
            }

        };

        r1.run();

        System.out.println("****************************");

        Runnable r2 = () -> System.out.println("BBBBB");

        r2.run();

        System.out.println("****************************");
    }

    public void test02() {
        Comparator<Integer> compare1 = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return Integer.compare(o1, o2);
            }

        };
        int compareRes1 = compare1.compare(12, 21);
        System.out.println(compareRes1);

        System.out.println("****************************");

        Comparator<Integer> compare2 = (o1, o2) -> Integer.compare(o1, o2);

        int compareRes2 = compare2.compare(21, 12);
        System.out.println(compareRes2);

        System.out.println("****************************");

        // 方法引用
        Comparator<Integer> compare3 = Integer::compare;

        int compareRes3 = compare3.compare(21, 12);
        System.out.println(compareRes3);

    }

}
