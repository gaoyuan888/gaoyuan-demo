package cn.gaoyuan.demo.algorithm;

/**
 * 功能描述:队列
 *
 * @author yaoyizhou
 * @date 2019/3/5 21:13
 * @desc
 */
public class MyQuene {
    int[] elements;

    public MyQuene() {
        elements = new int[0];
    }

    //判断是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }


    //入队
    public void add(int element) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    //出队
    public int poll() {
        int element = elements[0];
        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i + 1];
        }
        elements = newArray;
        return element;
    }
}
