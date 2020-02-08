package cn.gaoyuan.demo.atguigu;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/1 12:50
 * @desc
 */
public class TestDemo {
    public static void main(String[] args) {
        Myshare1 m = new Myshare1();
        new Thread(() -> {
            synchronized (m) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("类 ");
            }
        }).start();


        System.out.println("aaaaaaaaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new Thread(() -> {

            synchronized (m) {
                System.out.println("实例");
            }
        }).start();

    }
}

class Myshare1 {


}
