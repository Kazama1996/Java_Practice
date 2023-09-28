package DesignPattern.Decorator;

public class SugarDecorator extends ConfimentDecorator {
    public SugarDecorator(Baverage coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return super.cost() + 0.2;
    }

    @Override
    public String getDescription() {

        return super.getDescription() + "+ 糖";
    }

}
