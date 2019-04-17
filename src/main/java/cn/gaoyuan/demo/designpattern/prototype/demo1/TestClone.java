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

        rs.setName("xl 同学");
        rs.setHobby(new String[]{"1","2","3"});
        rs.setAge(12);

        Resume clone = (Resume) rs.clone();
        clone.setAge(19);


        System.out.println(rs);
        System.out.println(clone+"---");

//        浅克隆对string[]类型只复制了当前地址
        System.out.println(rs.getHobby());
        System.out.println(clone.getHobby());
        System.out.println(clone.getHobby()==rs.getHobby());
        System.out.println("=============================================");

        String[] hobby = clone.getHobby();
        hobby[0]="打游戏";
        System.out.println(rs.getHobby());
        System.out.println(clone.getHobby());
        System.out.println(clone.getHobby()==rs.getHobby());

    }
}
