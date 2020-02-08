package cn.gaoyuan.demo.atguigu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/2 19:21
 * @desc
 */
public class Test1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> ss=null;
        for (String s : ss) {

        }


        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("d://a.object")));
        oos.writeObject(new MyClass(1,2));

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("d://a.object")));
        MyClass o = (MyClass)ois.readObject();
        System.out.println(o);

    }
}

class MyClass implements Serializable{
    private int a;
    private int b;



    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
