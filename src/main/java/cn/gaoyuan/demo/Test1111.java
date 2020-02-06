package cn.gaoyuan.demo;

class TreeNode1 {
    TreeNode1 left;
    TreeNode1 right;
    int value;

    public TreeNode1(int value) {
        this.value = value;
    }
}


/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/12/19 13:00
 * @desc
 */
public class Test1111 {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        TreeNode1 rleft = new TreeNode1(2);
        TreeNode1 rright = new TreeNode1(3);
        root.left = rleft;
        root.right = rright;

        TreeNode1 rleft1 = new TreeNode1(4);
        TreeNode1 rright1 = new TreeNode1(5);
        rleft.right = rright1;
        rleft.left = rleft1;

        TreeNode1 rleft2 = new TreeNode1(6);
        TreeNode1 rright3 = new TreeNode1(7);
        rright.right = rright3;
        rright.left = rleft2;


        TreeNode1 son = new TreeNode1(1);

        TreeNode1 sleft = new TreeNode1(2);
        TreeNode1 sright = new TreeNode1(3);
        son.left = sleft;
        son.right = sright;

        TreeNode1 sleft1 = new TreeNode1(4);
        TreeNode1 sright1 = new TreeNode1(5);
        sleft.left = sleft1;
        sleft.right = sright1;

        TreeNode1 sleft2 = new TreeNode1(6);
        TreeNode1 sright3 = new TreeNode1(7);
        sright.left = sleft2;
        sright.right = sright3;


        boolean solution = solution(root, sleft);

        System.out.println(solution);
    }


    public static boolean solution(TreeNode1 root, TreeNode1 son) {
        if (root == null && son == null) {
            return true;
        }
        if (root == null || son == null) {
            return false;
        }

        if (root.value != son.value) {
            return false;
        }
        return solution(root.left, son.left) && solution(root.right, son.right);
    }
}
