package cn.gaoyuan.demo.netty.rpc;

import java.io.Serializable;

/**
 * 功能描述:
 * 实体类用来封装消费方发起远程调用时传给服务方的数据
 *
 * @author yaoyizhou
 * @date 2019/8/12 13:02
 * @desc
 */
public class ClassInfo implements Serializable {

    private static final Long serialVersionUID = 1L;
    //类名
    private String className;
    //方法名
    private String methodName;
    //参数类型
    private Class<?>[] types;
    //参数列表
    private Object[] objects;


    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class<?>[] getTypes() {
        return types;
    }

    public void setTypes(Class<?>[] types) {
        this.types = types;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }
}
