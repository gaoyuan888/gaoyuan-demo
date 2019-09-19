package cn.gaoyuan.demo.stringdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/9/9 18:11
 * @desc
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.swap(list, 0, 1);
        System.out.println(list);
    }
}
