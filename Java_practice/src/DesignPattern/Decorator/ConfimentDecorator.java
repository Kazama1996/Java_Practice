package DesignPattern.Decorator;

public class ConfimentDecorator implements Baverage {
    protected Baverage decoratedCoffee;

    public ConfimentDecorator(Baverage coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

}
