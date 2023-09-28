package DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Fukubukuro extends Gift {
    private List<Gift> giftList = new ArrayList<Gift>();

    @Override
    public void add(Gift gift) {
        this.giftList.add(gift);
    }

    @Override
    public int getPrice() {
        return giftList.stream().mapToInt(Gift::getPrice).sum();

    }

}
