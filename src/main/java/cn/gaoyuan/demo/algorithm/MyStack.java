package cn.gaoyuan.demo.algorithm;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/5 20:33
 * @desc
 */
public class MyStack {
    int[] elements;

    public MyStack() {
        elements = new int[1];
    }

    //弹出栈顶元素
    public int pop() {
        boolean b = elements.length > 0;
        if (!b) {
            throw new RuntimeException("stock is empy");
        }
        int element = elements[elements.length - 1];
        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
        return element;
    }


    //压入栈顶元素
    public void push(int element) {
        int[] newEle = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newEle[i] = elements[i];
        }
        newEle[elements.length] = element;
        elements = newEle;
    }

    //查看栈顶元素
    public int peek() {
        if (elements.length == 0) {
            throw new RuntimeException("stock is empy");
        }
        return elements[elements.length - 1];
    }

}
