package DesignPattern.Proxy.DProxy;

public class Superman implements Human {

    @Override
    public String getBelief() {
        // TODO Auto-generated method stub

        return "I beliese I can fly";
    }

    @Override
    public void eat(String food) {
        // TODO Auto-generated method stub

        System.out.println("I like to eat" + food);
    }

}
