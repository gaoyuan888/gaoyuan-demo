package cn.gaoyuan.demo.algorithm.node;

import cn.gaoyuan.demo.algorithm.quene.MyQuene;
import cn.gaoyuan.demo.algorithm.stack.MyStack;
import org.junit.Test;

import java.util.Arrays;

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
