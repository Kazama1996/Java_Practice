package DesignPattern.Decorator;

public class Espresso implements Baverage {

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "濃縮咖啡";
    }

}
