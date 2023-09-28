package DesignPattern.FactoryMethodPattern;

public class CheeseBurger extends Burger {

    public CheeseBurger() {
    }

    Boolean mozzarella;

    public void prepare() {
        System.out.println("Prepare CheeseBurger");

    }
}
