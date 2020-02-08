package cn.gaoyuan.demo.atguigu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/4 20:55
 * @desc
 */
public class FactoryProxy {
    private Object i;

    public FactoryProxy(Object i) {
        this.i = i;
    }

    public Object getInstance() {
        return Proxy.newProxyInstance(i.getClass().getClassLoader(), i.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理开始");
                Object invoke = method.invoke(i, args);
                return invoke;
            }
        });
    }
}
