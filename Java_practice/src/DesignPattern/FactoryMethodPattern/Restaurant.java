package DesignPattern.FactoryMethodPattern;

public class Restaurant {
    public Burger orderBurger(String request) {
        Burger burger = null;
        if ("Beef".equals(request)) {
            burger = new BeefBurger();
        } else if ("Cheese".equals(request)) {
            burger = new CheeseBurger();
        }
        burger.prepare();

        return burger;
    }
}
