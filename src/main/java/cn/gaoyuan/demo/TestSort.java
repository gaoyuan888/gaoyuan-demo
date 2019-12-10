package cn.gaoyuan.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/25 19:31
 * @desc
 */
public class TestSort {

    public static void main(String[] args) {
        List<Aaa> list = new ArrayList<>();
        Aaa aa = new Aaa(1, 1);
        Aaa aa1 = new Aaa(2, 1);
        Aaa aa2 = new Aaa(3, 1);
        list.add(aa2);
        list.add(aa);
        list.add(aa1);

        list.sort((a, b) -> a.getA() - b.getA());
        System.out.println(list);
        System.out.println(list);
    }


}

class Aaa {
    int a;
    int b;

    public Aaa(int a, int b) {
        this.a = a;
        this.b = b;
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
