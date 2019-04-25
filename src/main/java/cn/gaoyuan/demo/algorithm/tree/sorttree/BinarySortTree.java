package cn.gaoyuan.demo.algorithm.tree.sorttree;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/23 20:30
 * @desc
 */
public class BinarySortTree {
    Node root;

    /**
     * 想二叉排序树中添加节点
     *
     * @param node
     */
    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }

    }

    /**
     * 中序遍历二叉树，从小到大遍历
     */
    public void middleShow() {
        if (root != null) {
            root.middleShow(root);
        }
    }


    /**
     * 节点查找
     *
     * @param value
     * @return
     */
    public Node search(int value) {
        if (root == null) {
            return null;
        }
        return root.search(value);

    }

    /**
     * 删除
     *
     * @param value
     */
    public void delete(int value) {
        if (root == null) {
            return;
        }
        //找到这个节点
        Node target = search(value);
        if (target == null) {
            return;
        }
        //找到父节点
        Node parent = searchParent(value);
        //要删除节点是叶子节点
        if (target.left == null && target.left == null) {
            //要删除的节点是父节点的左节点
            if (parent.left.value == value) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

//        root.delete(new Node(value));
    }

    //查找父节点
    public Node searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }

    }

}
