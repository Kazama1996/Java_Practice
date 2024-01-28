package DesignPattern.Proxy.DProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//實現動態代理要解決什麽問題 ？？
// 1. 如何根據加載到內存的 "被代理 Class" 動態的建立一個 "代理 class " 以及 "其object"
// 2.  當透過 "代理class" 的 object 調用方法時 , 如何動態的去調用 "被代理class" 中的同名方法

public class ProxyFactory {

    // invoke 此方法來 return 一個 proxy 的 object
    public static Object getProxyInstance(Object obj) { // obj = 被代理class 的 object

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();

        myInvocationHandler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                myInvocationHandler);
    }
}
