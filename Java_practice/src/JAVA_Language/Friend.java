package JAVA_Language;

public class Friend implements Cloneable {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Friend clone() throws CloneNotSupportedException {
        return (Friend) super.clone();
    }

    public Friend(Friend other) {
        this.name = other.name;
    }

    public void setName(String string) {
        this.name = string;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }

}
