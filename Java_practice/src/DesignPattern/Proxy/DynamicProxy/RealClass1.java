package DesignPattern.Proxy.DynamicProxy;

public class RealClass1 implements RealInterface {

    @Override
    public void say() {
        System.out.println("Realclass1 Hello");
    }

    @Override
    public void eat() {
        System.out.println("Realclass1 Hello");
    }
}
