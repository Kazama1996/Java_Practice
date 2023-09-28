package DesignPattern.FactoryMethodPattern;

public class BeefBurger extends Burger {
    Boolean angus;

    public BeefBurger() {
    }

    public void prepare() {
        System.out.println("Prepare BeefBurger");
    }
}
