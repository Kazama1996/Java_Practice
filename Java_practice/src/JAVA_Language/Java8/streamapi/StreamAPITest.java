package JAVA_Language.Java8.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import JAVA_Language.Java8.methodref.Employee.Employee;
import JAVA_Language.Java8.methodref.Employee.EmployeeData;

public class StreamAPITest {

    // 一 Stream 的 實例化
    // 1. 通過Collection 建立Stream 的 instance
    public void test01() {
        List<Employee> list = EmployeeData.getEmployees();

        Stream<Employee> stream1 = list.stream();

        Stream<Employee> stream2 = list.parallelStream();
    }

    // 2. 通過array 建立stream 的 instance
    public void test02() {
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };

        Stream<Integer> stream = Arrays.stream(arr);

        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };

        IntStream stream2 = Arrays.stream(arr1);

    }

    // 3. 透過Stream 的 of()來建立 stram 的 instance
    public void test03() {
        Stream<String> of = Stream.of("AA", "BB", "CC", "SS", "EE");
    }

    // 二 中間操作
    // 1. 篩選與切片
    public void test04() {
        List<Employee> list = EmployeeData.getEmployees();
        // filter(Predicate p) 接收lambda 從Stream 中排除某些條件的元素
        System.out.println("****************************************************");
        // 練習 查詢員工薪水大於7000的員工資料
        list.stream().filter(emp -> emp.getSalary() > 7000).forEach(System.out::println);
        System.out.println("****************************************************");

        // Limit(n) 截斷stream 使元素不超過n個

        // 練習 查詢員工薪水大於7000的員工資料並且返回找到的前兩個結果
        list.stream().filter(emp -> emp.getSalary() > 7000).limit(2).forEach(System.out::println);
        System.out.println("****************************************************");

        // skip(n) 掉過n個元素
        list.stream().filter(emp -> emp.getSalary() > 7000).skip(2).forEach(System.out::println);
        System.out.println("****************************************************");

        // distinct() 去除重複
        list.add(new Employee(7, "test007", 17, 877.65));
        list.add(new Employee(7, "test007", 17, 877.65));
        list.add(new Employee(7, "test007", 17, 877.65));
        list.add(new Employee(7, "test007", 17, 877.65));
        list.stream().distinct().forEach(System.out::println);

    }

    // 2-映射
    public void test05() {
        List<String> list = Arrays.asList(
                "aa",
                "bb",
                "cc",
                "dd",
                "ee",
                "ff");
        // map (Function f) 接收一個function作為參數 將元素轉換成其他形式or提取資訊, 該函數會被應用到每個元素
        // 練習: 轉換成大寫
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Employee> empList = EmployeeData.getEmployees();

        // 獲取姓名長度大於3的 "員工"
        empList.stream().filter(emp -> emp.getName().length() > 3).forEach(System.out::println);
        System.out.println("****************************************************");

        // 獲取姓名長度大於3的 "員工姓名"
        empList.stream().filter(emp -> emp.getName().length() > 3).map(Employee::getName).forEach(System.out::println);
        System.out.println("****************************************************");

        empList.stream().map(Employee::getName).filter(name -> name.length() > 3).forEach(System.out::println);
    }

    // 排序
    public void test06() {
        // sorted()- 自然排序
        Integer[] arr = new Integer[] { 3, 124, 443, 7, 3, 773, 737, 68, 321, 15 };
        String[] sarr = new String[] { "as", "bwe", "awp", "usp", "mp7", "hk416" };

        Arrays.stream(arr).sorted().forEach(System.out::println);
        System.out.println(Arrays.toString(arr)); // arr不會因為經由stream 來調整成sorted

        Arrays.stream(sarr).sorted().forEach(System.out::println);

        List<Employee> employeeList = EmployeeData.getEmployees();
        // 因為Employee沒有 實現 Comparable 這個interface所以這行會報錯
        // employeeList.stream().sorted().forEach(System.out::println);

        // sorted(Comparator com)-- 客制化排序 只要實現 Comparator這個 functional interface
        // 依照員工年齡大小排序
        employeeList.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).forEach(System.out::println);

        // 針對String曉大到小排序
        Arrays.stream(sarr).sorted(String::compareTo).forEach(System.out::println);

    }

    // 批配與查找
    public void test07() {
        List<Employee> list = EmployeeData.getEmployees();

        // allMatch(Predicate p ) 檢查所有元素是否符合條件
        // 練習是否所有員工年齡都>18 ?
        Boolean res1 = list.stream().allMatch(emp -> emp.getAge() > 18);

        System.out.println(res1);

        // anyMatch(Predicate p) 檢查是否至少存在一個符合條件的元素
        // 是否存在員工的薪水>1000 ？
        Boolean res2 = list.stream().anyMatch(emp -> emp.getSalary() > 1000);
        System.out.println(res2);

        // findFirst -> return 第一個找到的元素
        // 找到第一個薪水>1000的員工
        Optional<Employee> findFirst = list.stream().filter(emp -> emp.getSalary() > 1000).findFirst();
        System.out.println(findFirst.get());

        // count() 求個數
        // 求有多少員工薪水超過 1000 ?
        long count = list.stream().filter(emp -> emp.getSalary() > 1000).count();
        System.out.println(count);

        // max(Compartor c) return stream裡的最大值
        // 練習: return 最高薪水的員工
        Optional<Employee> max = list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(max.get());

        // 練習 return 最高的薪水
        Optional<Double> max2 = list.stream().map(Employee::getSalary).max(Double::compareTo);
        System.out.println(max2.get());

        // min (Compartor c ) return stream裡的最小值
        // 練習: return 最低薪水的員工
        Optional<Employee> min = list.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(min.get());

        // 練習: return 員工最低的薪水
        Optional<Double> min2 = list.stream().map(Employee::getSalary).min(Double::compareTo);
        System.out.println(min2.get());

        // forEach(Consumer c) 內部迭代
        list.stream().forEach(System.out::println);
        System.out.println("************************************");
        // 對於Collection jdk8中增加一個遍歷的方法
        list.forEach(System.out::println);
        // 對於 List來說 遍歷的方式： 1 使用iterator 2 增強for 3 一般for 4 forEach()

    }

    // 規約
    public void test08() {
        // reduce(T identity , BinaryOperator) 可以將stream 裡面的元素反覆結合起來, 得到一個值 return T

        // 練習1 計算1-10 自然數的總和
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce1 = asList.stream().reduce(0, (x1, x2) -> x1 + x2);

        Integer reduce2 = asList.stream().reduce(10, Integer::sum);
        System.out.println(reduce1);

        System.out.println(reduce2);

        // reduce(BinartOperator)- 可以將stream裡的元素反覆結合起來,得到一個值, return Optional<T>

        // 練習1 計算所有員工薪水的總和
        List<Employee> list = EmployeeData.getEmployees();

        Optional<Double> reduce = list.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(reduce.get());
    }

    // 收集
    public void test09() {
        List<Employee> empList = EmployeeData.getEmployees();

        // 練習1找薪水大於10000的員工結果return 一個List
        List<Employee> collect = empList.stream().filter(emp -> emp.getSalary() > 10000).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        // 練習2 按照員工年齡排序 return 一個List

        List<Employee> collect2 = empList.stream().sorted((e1, e2) -> -e1.getAge() - e2.getAge())
                .collect(Collectors.toList());
        collect2.forEach(System.out::println);

    }

}
