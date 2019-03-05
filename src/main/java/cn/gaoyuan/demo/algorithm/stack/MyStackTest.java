package cn.gaoyuan.demo.algorithm.stack;

import cn.gaoyuan.demo.algorithm.quene.MyQuene;
import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/4 10:38
 * @desc
 */
public class MyStackTest {

    @Test
    public void mystack() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        int peek = stack.peek();
        System.out.println(peek);
        int pop = stack.pop();
        System.out.println(pop);
        int pop1 = stack.pop();
        System.out.println(pop1);
    }


}
