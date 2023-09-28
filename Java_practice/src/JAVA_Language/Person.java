package JAVA_Language;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Friend friend;

    public Person(String name, int age, Friend friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.friend = other.friend;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 實現淺拷貝
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Person clonedPerson = (Person) super.clone();
        // // 若 Friend 類也是可拷貝的，你可以進行淺拷貝，否則需要自行處理
        // clonedPerson.friend = (Friend) friend.clone();
        return super.clone();
    }

    public Person deepClone() throws CloneNotSupportedException {
        Person clonePerson = (Person) super.clone();
        clonePerson.friend = this.friend.clone();
        return clonePerson;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", friend='" + getFriend().toString() + "'" +
                "}";
    }

}
