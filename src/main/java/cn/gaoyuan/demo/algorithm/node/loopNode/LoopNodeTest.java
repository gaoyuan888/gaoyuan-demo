package cn.gaoyuan.demo.algorithm.node.loopNode;

import cn.gaoyuan.demo.algorithm.node.Node;
import org.junit.Test;

/**
 * 功能描述:链表相关操作测试
 *
 * @author yaoyizhou
 * @date 2019/3/4 10:38
 * @desc
 */
public class LoopNodeTest {

    @Test
    public void myNode() {
        LoopNode node = new LoopNode(1);
        LoopNode node2 = new LoopNode(2);
        LoopNode node3 = new LoopNode(3);
        LoopNode node4 = new LoopNode(4);
        node.after(node2);
        System.out.println(node.next.getValue());
        node2.after(node3);
        System.out.println(node2.next.getValue());
        node3.after(node4);
        System.out.println(node3.next.getValue());
    }


}
