package cn.gaoyuan.demo.algorithm.stackdemo;

import java.util.Stack;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/8/30 11:15
 * @desc
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        reverseStack(ss);
    }

    public static Integer popLast(Stack<Integer> s) {
        Integer pop = s.pop();
        if (s.isEmpty()) {
            return pop;
        }
        Integer res = popLast(s);
        s.push(pop);
        return res;
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        Integer integer = popLast(s);
        reverseStack(s);
        s.push(integer);
    }
}
