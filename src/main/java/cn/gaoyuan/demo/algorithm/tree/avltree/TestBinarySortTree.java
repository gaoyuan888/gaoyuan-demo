package cn.gaoyuan.demo.algorithm.tree.avltree;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/23 20:37
 * @desc
 */
public class TestBinarySortTree {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        BinarySortTree bst = new BinarySortTree();
        //循环添加
        for (int i : arr) {
            bst.add(new Node(i));
        }
        System.out.println(bst.root.height());
    }
}
