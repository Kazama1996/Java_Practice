package JAVA_Language.reflection.ch5;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
 * 獲取目前Runtime class的屬性結構
 */

public class FieldTest {

    public void test1() {
        Class clazz = Person.class;

        // 獲取屬性結構
        // getFields() 可以獲取目前的Runtime class 以及他的父類 的 所有public 權限的屬性
        Field[] fields = clazz.getFields();

        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("-----------------------------------------------------------------------");

        // getDeclaredFields() 獲取目前Runtime class 中所有聲明的屬性 不管權限與否 "不包含其父類的屬性"
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }
    }

    // Access modifier , Data type , Variable name
    public void test2() {
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field f : declaredFields) {

            // Access modifier
            int modifiers = f.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");

            // Data type
            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            // Variable Name
            String vName = f.getName();
            System.out.print(vName + "\t");
            System.out.println();

        }

    }

}
