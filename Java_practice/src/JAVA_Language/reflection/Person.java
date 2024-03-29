package JAVA_Language.reflection;

public class Person {

    private String name;
    public int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                "}";
    }

    public void show() {
        System.out.println("Hello~~~");
    }

    private String showNation(String nation) {
        return "My nation is " + nation;
    }

}
