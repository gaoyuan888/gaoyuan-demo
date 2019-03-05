package cn.gaoyuan.demo.algorithm.array;

import cn.gaoyuan.demo.algorithm.quene.MyQuene;
import cn.gaoyuan.demo.algorithm.stack.MyStack;
import org.junit.Test;

import java.util.Arrays;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/4 10:38
 * @desc
 */
public class MyArrayTest {

    @Test
    public void myQuene() {
        MyQuene quene = new MyQuene();
        quene.add(3);
        quene.add(4);
        quene.add(5);

        System.out.println(quene.poll());
        System.out.println(quene.poll());
        System.out.println(quene.poll());

        System.out.println(quene.isEmpty());

    }

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

    @Test
    public void array() {
        int[] a = new int[]{1, 2, 3};

        int[] b = new int[4];

        a = b;
        a[3] = 4;

        System.out.println(Arrays.toString(a));

    }

    @Test
    public void addValue() {

        int[] a = new int[]{1, 2, 3, 4};

        int[] b = new int[a.length - 1];

        int flag = 2;

        for (int i = 0; i < a.length - 1; i++) {
            if (i < flag) {
                b[i] = a[i];
            } else {
                b[i] = a[i + 1];
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
