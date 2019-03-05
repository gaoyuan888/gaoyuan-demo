package cn.gaoyuan.demo.algorithm.node;

import org.junit.Test;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/4 10:38
 * @desc
 */
public class NodeTest {

    @Test
    public void myNode() {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node.append(node2);
        node2.append(node3);

    }


}
