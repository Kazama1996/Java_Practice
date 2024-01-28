package JAVA_Language.interfaceAndAbstractclass;

public interface MyInterface1 {

    public void methodI1();

    public static void methodIS1() {
        System.out.println("Static method in Interface 1");
    }

    default void methodID1() {
        System.out.println("This is default method 1 ");
    }
}
