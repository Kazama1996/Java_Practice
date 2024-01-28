package JAVA_Language.reflection.ch5;

@MyAnnotation(value = "NMSL")
public class Person extends Creature<String> implements Comparable, MyInterface {

    private String name;
    int age;
    public int id;

    public Person() {

    }

    @MyAnnotation(value = "abc")
    private Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    private String show(String nation) {
        System.out.println("我的國籍: " + nation);
        return nation;
    }

    public String display(String interests, int age) throws NullPointerException, ClassCastException {
        return interests + age;
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        System.out.println("我是一個人");
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    private static void showDesc() {
        System.out.println("I m static method");
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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", id='" + getId() + "'" +
                "}";
    }

}
