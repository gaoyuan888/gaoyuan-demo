package cn.gaoyuan.demo.algorithm.node.loopNode;

/**
 * 功能描述:循环链表
 *
 * @author yaoyizhou
 * @date 2019/3/5 21:32
 * @desc
 */
public class LoopNode {

    /**
     * 值
     */
    int value;
    /**
     * 下一个节点,就是自己
     */
    LoopNode next = this;

    public LoopNode(int value) {
        this.value = value;
    }

    /**
     * 插入一个节点作为当前节点的下一个节点
     *
     * @param node
     */
    public void after(LoopNode node) {
        LoopNode nextNext = this.next;
        this.next = node;
        node.next = nextNext;
    }

    /**
     * 打印所有节点信息
     */
    public void show() {
        LoopNode currentNode = this;
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
        LoopNode newNext = next.next;
        this.next = newNext;
    }

    /**
     * 获取当前节点下一个节点
     *
     * @return
     */
    public LoopNode next() {
        return this.next;
    }

    /**
     * 为节点追加节点*** 循环链表没有这个方法
     *
     * @param node
     * @return
     */
//    public LoopNode append(LoopNode node) {
//        LoopNode current = this;
//        while (true) {
//            if (current.next == null) {
//                break;
//            }
//            current = current.next;
//        }
//        current.next = node;
//        return this;
//    }

    /**
     * 获取当前节点的值
     *
     * @return
     */
    public int getValue() {
        return this.value;
    }
}
