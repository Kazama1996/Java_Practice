package JAVA_Language.reflection.ch6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import JAVA_Language.reflection.ch5.Person;

public class ReflectionTest1 {

    public void testField() throws Exception {
        Class<Person> clazz = Person.class;

        // 建立Runtime class的 Object
        Person p = clazz.newInstance();

        // 指定想要獲取的屬性： 要求Runtime class 中屬性要聲明是public 的
        // 通常不採用此方法
        Field id = clazz.getField("id");

        // 設置目前屬性的值
        // 參數1 要設定那一個Objec的屬性 參數2 將這個屬性設定成多少（賦值）
        id.set(p, 80);

        // 獲取ˋ 某個對象的屬性值
        int personId = (int) id.get(p);

        System.out.println(personId);

    }

    /*
     * 如何去操作Runtime class 的屬性
     */
    public void testField1() throws Exception {
        Class<Person> clazz = Person.class;

        // 建立Runtime class的 Object
        Person p = clazz.newInstance();

        // 獲取Runtime class 中 指定名稱的field
        Field name = clazz.getDeclaredField("name");

        // 保證目前屬性是accessible
        name.setAccessible(true);

        // 設置 指定Object(目前是Person) 的 屬性 "name" 的值
        name.set(p, "Tom");

        System.out.println(name.get(p));

    }

    /*
     * 如何操作Runtime class 的 method
     */

    public void methodTest() throws Exception {

        Class<Person> clazz = Person.class;

        Person p = clazz.newInstance();

        // getDeclaredMethod
        // 參數1 獲取Runtime class（Persno) 方法的名稱(show)
        // 參數2 指名獲取方法的參數列表
        Method show = clazz.getDeclaredMethod("show", String.class);

        show.setAccessible(true);

        /*
         * invoke(方法調用者, 調用方法的型參)
         * invoke() 的 return 值 就是調用方法的return 值 也就是 Person.show 的 return 值
         */
        Object returnValue = show.invoke(p, "Japan"); // String nation = p.show("Japan");

        System.out.println(returnValue);

        // private static void showDesc()
        Method showDesc = clazz.getDeclaredMethod("showDesc");

        showDesc.setAccessible(true);

        // 如果調Runtime class 的method 沒有 return value 則 invoke() return "null"
        Object returnVal = showDesc.invoke(Person.class);
        System.out.println(returnVal);

    }

    /*
     * 如何調用Runtime class 的 constructor
     * 
     */

    public void testConstructor() throws Exception {

        Class<Person> clazz = Person.class;

        /*
         * 獲取Runtime class 特定的Constructor 根據 getDeclaredConstructor() 裡面填的parameter
         */
        Constructor constructor = clazz.getDeclaredConstructor(String.class);

        constructor.setAccessible(true);
        Person p = (Person) constructor.newInstance("Jerry");

        System.out.println(p.toString());

    }
}
