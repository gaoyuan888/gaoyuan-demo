package cn.gaoyuan.demo.test;

import java.io.Serializable;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/17 12:56
 * @desc
 */
public class Test2 implements Serializable {
    public static void main(String[] args) {
        Integer query = query();
        System.out.println(query);
    }

    private static Integer query() {
//        Mydata mydata = new Mydata();
        Integer i = 0;
        try {
//            int i1 = 1 / 0;
            i += 10;
            return i;
        } catch (Exception e) {
            throw e;
        } finally {
            i += 10;
//            return i[0];
        }
    }
}

class Mydata {
    int a = 0;
}
