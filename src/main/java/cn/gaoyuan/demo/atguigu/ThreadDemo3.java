package cn.gaoyuan.demo.atguigu;

class Myshare3 {
    private int status = 0;
    public void setStatus(int status) throws Exception{
        synchronized (this) {
            this.status=status;
            System.out.print(status);
            this.notify();
            this.wait();
        }
    }
}


/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/23 22:19
 * @desc
 */
public class ThreadDemo3 {

    public static void main(String[] args)throws Exception {
        Myshare3 myshare3 = new Myshare3();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    myshare3.setStatus(2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "AA").start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    myshare3.setStatus(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "AA").start();




    }
}
