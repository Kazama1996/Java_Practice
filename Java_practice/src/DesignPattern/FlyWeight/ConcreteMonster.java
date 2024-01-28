package DesignPattern.FlyWeight;

public class ConcreteMonster implements Monster {

    private String type;
    private int atk;
    private int def;

    public ConcreteMonster(String type, int atk, int def) {
        this.type = type;
        this.atk = atk;
        this.def = def;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在 (" + x + ", " + y + ") 生成一個 " + type + " 攻擊力 : " + atk + " 防禦力 : " + def);
    }

}
