package cn.gaoyuan.demo.algorithm.node;

/**
 * 功能描述:链表
 *
 * @author yaoyizhou
 * @date 2019/3/5 21:32
 * @desc
 */
public class Node {

    /**
     * 值
     */
    int value;
    /**
     * 下一个节点
     */
    Node next;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 获取当前节点下一个节点
     *
     * @return
     */
    public Node next() {
        return this.next;
    }

    /**
     * 为节点追加节点
     *
     * @param node
     * @return
     */
    public Node append(Node node) {
        Node current = this;
        while (true) {
            if (current.next == null) {
                break;
            }
            current = current.next;
        }
        current.next = node;
        return this;
    }

    /**
     * 获取当前节点的值
     *
     * @return
     */
    public int getValue() {
        return this.value;
    }
}
