package JAVA_Language.reflection;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    // 反射之前對於Person的操作

    public void test1() {
        // 1. 建立 Person 這個Class的 Object
        Person p1 = new Person("Adam", 19);

        // 2. 通過調用, 內部的屬性何方法
        // 修改 public 屬性
        p1.age = 10;
        System.out.println(p1.toString());
        // 調用 public 方法
        p1.show();

        // 在Person 外部 不可以通過Person Class 所建立的Object （p1）調用內部的private 成員or方法 e.g. name ,
        // showNation() 以及 private 的 constructor

    }

    // 反射之後 對於Person 的操作
    public void test2() throws Exception {

        // 1 通過反射 建立 Person 這個Class的 Object
        Class cla = Person.class;
        Constructor cons = cla.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Adam", 19);
        System.out.println(obj.toString());
        Person p = (Person) obj;
        System.out.println(p.toString());

        // 2 通過反射 調用內部的屬性＆方法

        // 2-1 調用屬性
        Field age = cla.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p.toString());

        // 2-2調用方法
        Method method = cla.getDeclaredMethod("show");
        method.invoke(p);

        // 3 通過反射 調用Person Class 的 私有結構 e.g.私有的Constructor , 屬性 & 方法

        // 3-1 調用私有的Constructor
        Constructor constructor1 = cla.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person p1 = (Person) constructor1.newInstance("Tom");
        System.out.println(p1.toString());

        // 3-2 調用私有的屬性
        Field name = cla.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "Jerry");
        System.out.println(p1.toString());

        // 3-2 調用私有的方法
        Method m1 = cla.getDeclaredMethod("showNation", String.class);
        m1.setAccessible(true);
        String nationMessage = (String) m1.invoke(p, "Japan");
        System.out.println(nationMessage);

    }

    // 獲取Class的實例的方式
    public void test3() throws ClassNotFoundException {

        // 方法 1: 調用Runtime class 的 "".class"屬性
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        // 方法 2: 通過Runtime class 的 對象(object), invoke getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        // 方法 3: 通過Class 的靜態方法: forName(String classPath) 記住 classPath 要包含package name
        // 也就是要寫全名
        Class clazz3 = Class.forName("JAVA_Language.reflection.Person");
        System.out.println(clazz3);

        // 方法 4: 使用類加載器(ClassLoader)
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("JAVA_Language.reflection.Person");
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz4);

    }

    public void test4() {
        Class c1 = Object.class; // 對應上面 1
        Class c2 = Comparable.class; // ....上面 2
        Class c3 = String[].class; // 3
        Class c4 = int[][].class; // 3
        Class c5 = ElementType.class; // 4
        Class c6 = Override.class; // 5
        Class c7 = int.class; // 6
        Class c8 = void.class; // 7
        Class c9 = Class.class; // 1

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c100 = b.getClass();
        System.out.println(c10 == c100);

        char[] c = new char[10];
        Class ch10 = c.getClass();
        System.out.println(c10 == ch10);
    }

}
