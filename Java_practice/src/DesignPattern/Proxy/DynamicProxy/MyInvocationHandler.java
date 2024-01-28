package DesignPattern.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object obj;

    public void bind(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Proxy Before");
        Object res = arg1.invoke(obj, arg2);
        System.out.println("Proxy After");
        return res;
    }

}
