package cn.gaoyuan.demo.algorithm.node;

/**
 * 功能描述:链表
 *
 * @author yaoyizhou
 * @date 2019/3/5 21:32
 * @desc
 */
public class Node {

    //值
    int value;
    //下一个节点
    Node next;

    public Node(int value) {
        this.value = value;
    }

    //    为节点追加节点
    public void append(Node node) {
        this.next = node;
    }
}
