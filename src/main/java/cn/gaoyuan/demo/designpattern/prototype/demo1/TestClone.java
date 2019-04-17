package cn.gaoyuan.demo.designpattern.prototype.demo1;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/17 19:48
 * @desc
 */
public class TestClone {

    public static void main(String[] args) {
        Resume rs=new Resume();
        Resume clone = (Resume) rs.clone();

        System.out.println(rs);
        System.out.println(clone);
        System.out.println(rs==clone);
    }
}
