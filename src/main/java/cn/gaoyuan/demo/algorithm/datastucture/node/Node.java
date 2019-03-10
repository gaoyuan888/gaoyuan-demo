package cn.gaoyuan.demo.algorithm.datastucture.node;

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
     * 插入一个节点作为当前节点的下一个节点
     *
     * @param node
     */
    public void after(Node node) {
        Node nextNext = this.next;
        this.next = node;
        node.next = nextNext;
    }

    /**
     * 打印所有节点信息
     */
    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
            if (currentNode == null) {
                break;
            }
        }
    }

    /**
     * 刪除下一节点**
     */
    public void removeNext() {
        Node newNext = next.next;
        this.next = newNext;
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
