package DesignPattern.Decorator;

public class MilkDecorator extends ConfimentDecorator {

    public MilkDecorator(Baverage coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription() + "+ 牛奶";
    }

}
