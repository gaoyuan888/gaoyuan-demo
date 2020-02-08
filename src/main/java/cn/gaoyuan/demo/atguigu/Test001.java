package cn.gaoyuan.demo.atguigu;

import cn.gaoyuan.demo.atguigu.proxy.CCC;
import cn.gaoyuan.demo.atguigu.proxy.TeacherDao;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/5 19:33
 * @desc
 */
public class Test001 extends TreeNod implements TeacherDao, CCC {
    static boolean flag = true;
    static Integer value = null;

    public Test001(Integer value) {
        super(value);
    }

    public static void main(String[] args) {
        TreeNod root = new TreeNod(4);

        TreeNod left = new TreeNod(2);
        TreeNod right = new TreeNod(6);

        root.left = left;
        root.right = right;

        TreeNod left1 = new TreeNod(1);
        TreeNod right1 = new TreeNod(3);
        left.left = left1;
        left.right = right1;

        TreeNod left2 = new TreeNod(5);
        right.left = left2;

        solution(root);

        System.out.println(flag);
    }

    public static void solution(TreeNod root) {
        if (root == null) {
            return;
        }
        solution(root.left);
        if (value == null) {
            value = root.value;
        } else {
            if (value > root.value) {
                flag = false;
                return;
            }
            value = root.value;
        }
        solution(root.right);
    }

    @Override
    public void teach() {

    }
}

class TreeNod {
    TreeNod left;
    TreeNod right;
    Integer value;

    public TreeNod(Integer value) {
        this.value = value;
    }

}