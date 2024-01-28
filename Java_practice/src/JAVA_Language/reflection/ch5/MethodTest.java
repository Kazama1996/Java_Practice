package JAVA_Language.reflection.ch5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodTest {

    public void test1() {
        Class clazz = Person.class;

        // getMethods 獲取目前Runtime class 以及其父類中聲明的 public method
        Method[] methods = clazz.getMethods();

        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println();
        // getDeclaredMethods() 獲取目前Runtime class 的所有方法 不包含其父類別的方法
        Method[] declarMethods = clazz.getDeclaredMethods();

        for (Method m : declarMethods) {
            System.out.println(m);
        }

    }

    /*
     * @XXX Annotation
     * Access modifier , return data type , method_name (parameter_name1 ,
     * parameter_name2) throws XXXException{}
     */
    public void test2() {
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();

        for (Method m : declaredMethods) {
            // 1 .獲取方法聲明的註解 只能拿到 RetentionPolicy.RUNTIME 的註解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }

            // 2. Access modifier
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            // 3. return data type
            System.out.print(m.getReturnType() + "\t");

            // 4. method name
            System.out.print(m.getName());

            System.out.print("(");
            // 5. parameter list
            Class[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + "args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + "args_" + i + ",");
                }
            }
            System.out.print(")");

            System.out.println();

            // 6. Exception throwing
            Class[] exceptionTypes = m.getExceptionTypes();

            if (exceptionTypes.length > 0) {
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");
                }
            }

            System.out.println();
        }

    }

}
