package cn.gaoyuan.demo.atguigu.proxy;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/4 20:56
 * @desc
 */
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void teach() {
        System.out.println("上课");
    }
}
