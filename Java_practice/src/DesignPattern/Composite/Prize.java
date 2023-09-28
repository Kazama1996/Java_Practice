package DesignPattern.Composite;

public class Prize extends Gift {
    private int price;

    public Prize(int price) {
        super();
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
