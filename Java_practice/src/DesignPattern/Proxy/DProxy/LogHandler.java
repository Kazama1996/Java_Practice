package DesignPattern.Proxy.DProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {
    Object obj;

    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {

        System.out.println("LogHandler: start Log");
        Object returnval = arg1.invoke(this.obj, arg2);
        System.out.println("LogHandler: end Log");

        return returnval;
    }

}
