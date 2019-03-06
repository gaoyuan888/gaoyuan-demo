package cn.gaoyuan.demo.algorithm.node.doubly;

/**
 * 功能描述:双向链表
 *
 * @author yaoyizhou
 * @date 2019/3/6 21:27
 * @desc
 */
public class DulNode {
    /**
     * 上一个节点
     */
    DulNode pre = this;
    /**
     * 下一个节点
     */
    DulNode next = this;

    /**
     * 节点数据
     */
    int data;

    public DulNode(int data) {
        this.data = data;
    }

    /**
     * 增加节点
     */
    public void after(DulNode node) {
        DulNode nextNext = this.next;

        this.next = node;
        node.pre = this;

        nextNext.pre = node;
        node.next = nextNext;
    }
}
