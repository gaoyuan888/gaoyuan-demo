package cn.gaoyuan.demo.algorithm.tree;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/13 18:43
 * @desc
 */
public class TreeNodeTest {

    @Test
    public void test() {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode node = new TreeNode(1);
        binaryTree.setRoot(node);
    }
}
