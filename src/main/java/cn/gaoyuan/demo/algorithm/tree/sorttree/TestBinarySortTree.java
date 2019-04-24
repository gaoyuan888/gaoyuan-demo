package cn.gaoyuan.demo.algorithm.tree.sorttree;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/23 20:37
 * @desc
 */
public class TestBinarySortTree {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        BinarySortTree bst = new BinarySortTree();
        //循环添加
        for (int i : arr) {
            bst.add(new Node(i));
        }

        System.out.println("=========中序遍历========");
        //中序遍历二叉树
        bst.middleShow();

        System.out.println("=========节点查找========");

        Node search = bst.search(10);
        System.out.println(search.value);

        Node search1 = bst.search(20);
        System.out.println(search1);

        System.out.println("=========查找父节点========");
        //测试查找父节点
        Node node = bst.searchParent(1);
        System.out.println(node.value);

        System.out.println("=========删除节点========");
        bst.delete(5);
        bst.middleShow();

    }
}
