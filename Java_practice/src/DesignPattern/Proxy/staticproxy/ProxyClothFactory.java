package DesignPattern.Proxy.staticproxy;

public class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        // TODO Auto-generated method stub

        System.out.println("代理工廠的準備工作");
        factory.produceCloth();

        System.out.println("代理工廠的後續處裡");
    }

}
