package JAVA_Language.Java8.methodref;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import JAVA_Language.Java8.methodref.Employee.Employee;

public class MethodRefTest {

    public void test01() {
        Consumer<String> com1 = new Consumer<String>() {

            @Override
            public void accept(String t) {
                // TODO Auto-generated method stub
                System.out.println(t);
            }

        };

        com1.accept("hello");

        Consumer<String> com2 = t -> System.out.println(t);

        com2.accept("Lambda: " + "hello");

        Consumer<String> com3 = System.out::println;

        com3.accept("Ref: " + "hello");

    }

    public void test02() {
        Employee emp = new Employee(1, "test001", 16, 94654.65);
        Supplier<String> sup1 = new Supplier<String>() {

            @Override
            public String get() {
                // TODO Auto-generated method stub
                return emp.getName();
            }

        };
        System.out.println(sup1.get());

        Supplier<String> sup2 = () -> emp.getName();
        System.out.println(sup2.get());

        Supplier<String> sup3 = emp::getName;
        System.out.println(sup3.get());

    }

    public void test03() {
        Comparator<Integer> com1 = new Comparator<Integer>() {

            @Override
            public int compare(Integer arg0, Integer arg1) {
                // TODO Auto-generated method stub
                return Integer.compare(arg0, arg1);
            }

        };

        System.out.println(com1.compare(21, 34));

        Comparator<Integer> com2 = (arg0, arg1) -> Integer.compare(arg0, arg1);
        System.out.println(com2.compare(21, 34));

        Comparator<Integer> com3 = Integer::compare;
        System.out.println(com3.compare(21, 34));

    }

    public void test04() {
        Function<Double, Long> func1 = new Function<Double, Long>() {

            @Override
            public Long apply(Double arg0) {
                // TODO Auto-generated method stub
                return Math.round(arg0);
            }

        };

        Function<Double, Long> func2 = arg0 -> Math.round(arg0);

        Function<Double, Long> func3 = Math::round;

    }

    public void test05() {
        Comparator<String> com1 = new Comparator<String>() {

            @Override
            public int compare(String arg0, String arg1) {
                // TODO Auto-generated method stub
                return arg0.compareTo(arg1);
            }

        };

        Comparator<String> com2 = (arg0, arg1) -> arg0.compareTo(arg1);

        Comparator<String> com3 = String::compareTo;

        System.out.println(com3.compare("abc", "abb"));

    }

    public void test06() {
        BiPredicate<String, String> biPre1 = new BiPredicate<String, String>() {

            @Override
            public boolean test(String arg0, String arg1) {
                // TODO Auto-generated method stub
                return arg0.equals(arg1);
            }

        };

        BiPredicate<String, String> biPre2 = (arg0, arg1) -> arg0.equals(arg1);

        BiPredicate<String, String> biPre3 = String::equals;

    }

    public void test07() {
        Employee emp = new Employee(44, "neneka", 27, 50000);

        Function<Employee, String> func1 = new Function<Employee, String>() {

            @Override
            public String apply(Employee arg0) {
                // TODO Auto-generated method stub
                return emp.getName();
            }

        };

        Function<Employee, String> func2 = arg0 -> emp.getName();

        Function<Employee, String> func3 = Employee::getName;

    }

    public void test08() {
        Supplier<Employee> sup1 = new Supplier<Employee>() {

            @Override
            public Employee get() {
                // TODO Auto-generated method stub
                return new Employee();
            }

        };

        Supplier<Employee> sup2 = () -> new Employee();

        Supplier<Employee> sup3 = Employee::new; // 調用Employee的空參constructor
    }

    public void test09() {
        Function<Integer, Employee> func1 = new Function<Integer, Employee>() {

            @Override
            public Employee apply(Integer arg0) {
                // TODO Auto-generated method stub
                return new Employee(arg0);
            }

        };

        Function<Integer, Employee> func2 = Employee::new; // 調用的是Employee 中的參數型constructor
    }

    public void test10() {
        BiFunction<Integer, String, Employee> biFunction1 = new BiFunction<Integer, String, Employee>() {

            @Override
            public Employee apply(Integer arg0, String arg1) {
                // TODO Auto-generated method stub
                return new Employee(arg0, arg1);
            }

        };

        BiFunction<Integer, String, Employee> biFunction2 = Employee::new; // 調用的是 Employee裡面 (Integer/int , String) 的
                                                                           // constructor

    }

    public void test11() {
        Function<Integer, Employee[]> func1 = new Function<Integer, Employee[]>() {

            @Override
            public Employee[] apply(Integer arg0) {
                // TODO Auto-generated method stub
                return new Employee[arg0];
            }

        };

        Function<Integer, Employee[]> func2 = Employee[]::new;

    }
}
