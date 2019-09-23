package cn.gaoyuan.demo.algorithm.tree.show;

import org.junit.Test;

import java.util.*;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class Zshow {

    @Test
    public static void maint() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        t1.left=t2;
        t1.right=t3;

        t2.left=t4;
        t2.right=t5;

        t3.left=t6;
        t3.right=t7;

        System.out.println(t1);



    }

    //z形遍历
    public static List<List<Integer>> solution1(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode nlast = root;
        TreeNode last = root;
        List<List<Integer>> list = new ArrayList<>();
        Integer detpth = 0;

        while (!q.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            Integer size = q.size();
            for (Integer i = 0; i < size; i++) {
                TreeNode t = q.poll();
                if (detpth % 2 == 0) {
                    tmp.addLast(t.value);
                } else {
                    tmp.addFirst(t.value);
                }
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
            list.add(tmp);
            detpth++;
        }
        return list;
    }


    //层序遍历
    public static void solution(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode nlast = root;
        TreeNode last = root;
        while (!q.isEmpty()) {
            TreeNode poll = q.poll();
            System.out.println(poll.value);
            if (poll.left != null) {
                q.offer(poll.left);
                nlast = poll.left;
            }
            if (poll.right != null) {
                q.offer(poll.right);
                nlast = poll.right;
            }
            if (poll == last) {
                last = nlast;
                System.out.println("=======");
            }

        }


    }

}
