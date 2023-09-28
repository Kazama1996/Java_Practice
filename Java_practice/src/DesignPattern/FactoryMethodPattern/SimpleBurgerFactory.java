package DesignPattern.FactoryMethodPattern;

public class SimpleBurgerFactory {
    public Burger createBurger(String request) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;

    }
}
