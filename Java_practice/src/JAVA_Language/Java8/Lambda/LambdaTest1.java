package JAVA_Language.Java8.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
 * 舉例 (o1, o2) ->Integer.compare(o1,o2);
 * 
 * 格式: 
 *      -> : Lambda運算符
 *      -> 的左邊: 型參列表 (其實就是 interface 的抽象方法的 "型參列表")
 *      -> 的右邊: Lambda 的 body (其實就是interface的抽象方法的 "實作內容" )
 * 
 * 舉體使用方法（分為六種）
 * 
 * Lambda表達是的本質: 作為interface 的 instance 並且這個 interface 只能有一個抽象方法 aka 函數式interface
 * 
 * 總結:
 *      -> 左邊: Lambda 型參列表的參數類型可以省略: 如果lambda型參列表只有一個參數, 他的()也可以省略
 *      -> 右邊: Lambda body應該使用一對{} 包覆:  如果 lambda body 裡面只有一條語句 （可能是return）語句, 可以省略{}跟 return 關鍵字
 * 
 */

public class LambdaTest1 {

    // 語法格式一 ： 無參數 無 return 值
    public void test01() {

        // 原本寫法
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("aaaaaaa");
            }

        };

        new Thread(r1).start();

        System.out.println("****************************");

        // Lambda寫法

        Runnable r2 = () -> System.out.println("Lambda:" + "aaaaaaa");

        new Thread(r2).start();

    }

    // 語法格式二 ： 需要一個參數 但是沒有return 值

    public void test02() {
        Consumer<String> con = new Consumer<String>() {

            @Override
            public void accept(String arg0) {
                // TODO Auto-generated method stub
                System.out.println(arg0);
            }

        };

        con.accept("安安");

        Consumer<String> con2 = (String arg0) -> System.out.println("Lambda: " + arg0);
        con2.accept("安安");
    }

    // 語法格式三 ： 參數的類型可以省略 因為可以由編譯器推斷得出 稱為 "類型推斷"
    public void test03() {

        Consumer<String> con1 = (String arg0) -> System.out.println("Lambda: " + arg0);

        con1.accept("安安");

        // 不用寫 String 由 Consumer<String> 讓變異器推斷 傳進去的參數 arg0 是 String 類型
        Consumer<String> con2 = (arg0) -> System.out.println("Lambda 類型推斷: " + arg0);

        con2.accept("安安");

        // 類型推斷的其他例子:
        List<String> list = new ArrayList<>(); // 類型推斷<>裡面填String

        int[] arr = { 1, 2, 3 }; // 類型推斷
    }

    // 語法格式四 ： Lambda 如果"只需要一個參數" 參數的小括號"可以省略"
    public void test04() {

        Consumer<String> con1 = (String arg0) -> System.out.println("Lambda: " + arg0);

        con1.accept("安安");

        // 省略 參數arg0 的小括號 因為這個lambda 只有一個 參數
        Consumer<String> con2 = arg0 -> System.out.println("Lambda 類型推斷: " + arg0);

        con2.accept("安安");

    }

    // 語法格式五 ： Lambda 需要兩個以上的參數, 不只一條的執行語句, 並且有 return value
    public void test05() {

        Comparator<Integer> com1 = new Comparator<Integer>() {

            @Override
            public int compare(Integer arg0, Integer arg1) {
                System.out.println(arg0);
                System.out.println(arg1);
                return arg0.compareTo(arg1);
            }

        };
        System.out.println(com1.compare(21, 12));

        Comparator<Integer> com2 = (arg0, arg1) -> {
            System.out.println(arg0);
            System.out.println(arg1);
            return arg0.compareTo(arg1);
        };

        System.out.println(com2.compare(21, 12));

    }

    // 語法格式六 ： Lambda body 裡面 只有一條語句, return 和 大括號都有, 都可以省略
    public void test06() {

        Comparator<Integer> com1 = (arg0, arg1) -> {
            return arg0.compareTo(arg1);
        };

        System.out.println(com1.compare(21, 12));

        Comparator<Integer> com2 = (arg0, arg1) -> arg0.compareTo(arg1);

        System.out.println(com2.compare(12, 12));

    }

}
