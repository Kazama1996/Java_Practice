package Launcher.ipml.DesignPattern;

import DesignPattern.Proxy.DProxy.Human;
import DesignPattern.Proxy.DProxy.LogHandler;
import DesignPattern.Proxy.DProxy.ProxyFactory;
import DesignPattern.Proxy.DProxy.Superman;
import DesignPattern.Proxy.staticproxy.ClothFactory;
import DesignPattern.Proxy.staticproxy.ProxyClothFactory;
import DesignPattern.Proxy.staticproxy.UniqloClothFactory;
import Launcher.Launcher;

public class ProxyLauncher implements Launcher {

    @Override
    public void launch() throws Exception {
        // // TODO Auto-generated method stub

        // // 建立被代理Class 的 Object
        // ClothFactory uniqlo = new UniqloClothFactory();

        // // 建立代理 Class 的 Object
        // ClothFactory proxyClothFactory = new ProxyClothFactory(uniqlo);

        // proxyClothFactory.produceCloth();

        Superman superman = new Superman();
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superman);

        // 透過調用代理class的方法時, 會自動調用被代理類中同名的方法
        String belief = proxyInstance.getBelief();

        System.out.println(belief);
        proxyInstance.eat(" sushi");

        System.out.println("----------------------------------");

        ClothFactory uniqloClothFactory = new UniqloClothFactory();
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(uniqloClothFactory);

        proxyClothFactory.produceCloth();

        // ClothFactory uniqClothFactory = new UniqloClothFactory();

        // LogHandler logHandler = new LogHandler();

        // ClothFactory colthFactoryProxy = (ClothFactory)
        // logHandler.bind(uniqClothFactory);

        // colthFactoryProxy.produceCloth();

    }

}
