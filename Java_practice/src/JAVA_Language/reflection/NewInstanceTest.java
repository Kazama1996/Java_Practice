package JAVA_Language.reflection;

import java.util.Random;

public class NewInstanceTest {

    public void test1() throws InstantiationException, IllegalAccessException {

        // 方法 1 newInstance() 調用此方法來建立對應Runtime class 的 Object
        // newInstance()內部則是invoke Runtime class 裡面沒有參數的 constructor
        // 所以建立任何Object 都得使用 constructor 只是他有可能會包成一個method 例如這邊用到的 newInstance().

        // 要想此方法正常建立Runtime class 的 Object:
        // 1. Runtime class必須提供沒有參數的constructor
        // 2. Runtime class的 constructor 訪問權限得夠 public or protected 通常設置為public

        // 先指定class 是 Person 的 Runtime class
        Class clazz = Person.class;

        // 接著再用 newInstance來 建立 Person 的 instance
        Object obj = (Person) clazz.newInstance();
        System.out.println(obj);

        // 方法1-1 可以在Class 後面+范型, 這樣就不用強轉 就直接會是Person
        Class<Person> clazz1_1 = Person.class;
        Person p1 = clazz1_1.newInstance();
        System.out.println(p1);

    }

    // 反射的動態性
    public void test2() {

        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(3); // 0 1 2
            String classPath = "";
            switch (num) {
                case 0:
                    classPath = "java.util.Date";
                    break;

                case 1:
                    classPath = "java.lang.Object";

                    break;

                case 2:
                    classPath = "JAVA_Language.reflection.Person";
                    break;
            }

            try {
                Object obj = getInstance(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    /*
     * 此方法是建立一個 指定類的Object
     */

    public Object getInstance(String classPath)
            throws Exception {
        Class clazz = Class.forName(classPath);

        return clazz.newInstance();

    }
}
