package cn.gaoyuan.demo.test;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/17 12:56
 * @desc
 */
public class Test2 {
    public static void main(String[] args) {
        int query = query();
        System.out.println(query);
    }

    private static int query() {

        int i = 0;
        try {
            int i1 = 1 / 0;
            return i += 10;
        } catch (Exception e) {
            throw e;
        } finally {
            i += 10;
            return i;
        }
    }
}
