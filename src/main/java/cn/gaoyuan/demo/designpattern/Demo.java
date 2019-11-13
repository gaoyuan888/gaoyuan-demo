package cn.gaoyuan.demo.designpattern;

import cn.gaoyuan.demo.test.Test2;

import java.io.*;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/13 12:40
 * @desc
 */
public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://a.obj"));
        Test2 test2=new Test2();
        oos.writeObject(test2);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d://a.obj"));
        Test2 o = (Test2)ois.readObject();
        System.out.println(o);

    }
}
