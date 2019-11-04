package cn.gaoyuan.demo.atguigu.proxy;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/4 21:05
 * @desc
 */
public class Client {

    public static void main(String[] args) {

        TeacherDao dao=new TeacherDaoImpl();

        TeacherDao instance = (TeacherDao)new FactoryProxy(dao).getInstance();
        instance.teach();
    }
}
