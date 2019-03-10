package cn.gaoyuan.demo.algorithm.datastucture.node.doubly;

import org.junit.Test;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/7 21:28
 * @desc
 */
public class DulNodeTest {

    @Test
    public void test() {
        DulNode node1 = new DulNode(1);
        DulNode node2 = new DulNode(2);
        DulNode node3 = new DulNode(3);

        node1.after(node2);

        node1.after(node3);

        System.out.println(node1.pre().getData());
        System.out.println(node1.next().getData());
        System.out.println(node1.getData());
    }

}
