package cn.gaoyuan.demo.springdemo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/7/31 13:50
 * @desc
 */
public class GServiceImpl implements GService {

    private GDao gDao;

    //通过构造方法注入
//    public GServiceImpl(GDao gDao) {
//        this.gDao = gDao;
//    }

    //    通过set方法注入
    public void setgDao(GDao gDao) {
        this.gDao = gDao;
    }

    @Override
    public void service() {
        gDao.gprint();
    }
}
