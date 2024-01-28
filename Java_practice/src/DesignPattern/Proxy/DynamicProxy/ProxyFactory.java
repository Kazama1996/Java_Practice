package DesignPattern.Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public <T> T getProxyInstance(T obj) {

        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);

    }
}
