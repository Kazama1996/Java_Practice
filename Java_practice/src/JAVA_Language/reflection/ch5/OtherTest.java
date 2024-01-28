package JAVA_Language.reflection.ch5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OtherTest {

    /*
     * 用反射獲取 Constructor
     */
    public void test1() {
        Class clazz = Person.class;

        // getConstructors() 獲取目前Runtime class 聲明為 "public" 的 constructor (不包含父類)
        Constructor[] constructors = clazz.getConstructors();

        for (Constructor c : constructors) {
            System.out.println(c);
        }

        // getDeclaredConstructors() 獲取目前Runtime class 中所有的 constructor
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();

        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }

    }

    /*
     * 獲取Runtime class 的父類
     */
    public void test2() {
        Class clazz = Person.class;

        Class superClass = clazz.getSuperclass();

        System.out.println(superClass);

    }

    /*
     * 獲取Runtime class 帶泛型的父類
     */
    public void test3() {
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();

        System.out.println(genericSuperclass);

    }

    /*
     * 獲取Runtime class 帶泛型的父類 "的泛型"
     */
    public void test4() {
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();

        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;

        // 獲取泛型的類型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

        System.out.println(actualTypeArguments[0].getTypeName());

    }

    /*
     * 獲取Runtime class 的 interface
     * 
     */

    public void test5() {
        Class clazz = Person.class;

        Class[] interfaces = clazz.getInterfaces();

        for (Class i : interfaces) {
            System.out.println(i);
        }

        System.out.println();
        // 獲取Runtime class 的父類實現的 interface
        Class[] interface1 = clazz.getSuperclass().getInterfaces();
        for (Class c : interface1) {
            System.out.println(c);
        }

    }

    /*
     * 獲取Runtime class 所在的 package
     * 
     */

    public void test6() {
        Class clazz = Person.class;

        Package pack = clazz.getPackage();

        System.out.println(pack);
    }

    /*
     * 獲取Runtime class 它上面的註解
     * 
     */

    public void test7() {
        Class clazz = Person.class;

        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation a : annotations) {
            System.out.println(a);
        }

    }

}
