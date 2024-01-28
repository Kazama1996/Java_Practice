package JAVA_Language.Java8.methodref.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "test001", 16, 94654.65));
        list.add(new Employee(2, "test002", 78, 644.65));
        list.add(new Employee(3, "test003", 4, 41254.65));
        list.add(new Employee(4, "test004", 15, 54124.65));
        list.add(new Employee(5, "test005", 78, 742154.65));
        list.add(new Employee(6, "test006", 33, 123574.65));
        list.add(new Employee(7, "test007", 17, 877.65));

        return list;

    }
}
