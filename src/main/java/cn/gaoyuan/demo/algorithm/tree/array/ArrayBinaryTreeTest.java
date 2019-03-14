package cn.gaoyuan.demo.algorithm.tree.array;

import org.junit.Test;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/3/14 13:01
 * @desc
 */
public class ArrayBinaryTreeTest {
    @Test
    public void test() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree tree = new ArrayBinaryTree(array);
        tree.frontShow();

    }
}
