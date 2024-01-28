package DesignPattern.Proxy.DProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object obj;// 賦值時,需要使用被代理 class的object進行賦值

    public void bind(Object obj) {
        this.obj = obj;
    }

    // 當我們透過代理class的 object 調用方法 a 時, 就會自動調用如下的invoke()方法
    // 將被代理class 要執行的方法a 的功能 就聲明在 invoke() 裡面
    @Override
    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        HumanUtil util = new HumanUtil();

        util.method1();

        // arg1: 即為代理 class 調用的方法 , 此方法也是 "被代理class"調用的同名方法.
        // obj "被代理class 的 object"
        Object returnval = arg1.invoke(this.obj, arg2);

        util.method2();
        // 上述方法的返回值就作為目前class中 invoke 的 return value
        return returnval;

    }

}
