package cn.gaoyuan.demo.thread;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/28 19:41
 * @desc
 */
public class TestVolatile {

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        new Thread(demo).start();
        while (true) {
            if (demo.isFlag()) {
                System.out.println("==============");
                break;
            }
        }
    }

}

class ThreadDemo implements Runnable {
    private boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        flag = true;
        System.out.println("flag=" + flag);
    }

    boolean isFlag() {
        return flag;
    }
}
