package cn.gaoyuan.demo.aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyCalculatorProxy{


    /**
     * 为传入的参数对象创建一个动态代理对象
     * @param myCalculator
     * @return
     */
    public  MyCalculator getProxy(MyCalculator myCalculator){

        ClassLoader loader = myCalculator.getClass().getClassLoader();
        Class<?>[] interfaces = myCalculator.getClass().getInterfaces();
        //方法执行器,执行目标对象的方法
        InvocationHandler handler = new InvocationHandler() {

            /**
             *
             * @param proxy 代理对象，给jdk使用，任何时候都不要动这个对象
             * @param method 将要执行的目标对象的方法
             * @param args 目标方法参数值
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //利用反射执行目标方法
                final Object result = method.invoke(myCalculator, args);
                return result;
            }
        };
        final Object proxyInstance = Proxy.newProxyInstance(loader, interfaces, handler);

        return (MyCalculator) proxyInstance;
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        MyCalculatorProxy proxy = new MyCalculatorProxy();
        final MyCalculator cal = proxy.getProxy(myCalculator);
        cal.add(1,2);
    }
}
