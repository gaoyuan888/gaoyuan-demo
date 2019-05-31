package cn.gaoyuan.demo.thread;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/5/27 14:03
 * @desc
 */
public class Deno {
    public static void main(String[] args) throws Exception {
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader();
        pw.connect(pr);

        Thread print = new Thread(new Print(pr), "print-thread");
        print.start();

        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {
                pw.write(receive);
            }
        } catch (Exception e) {

        } finally {
            pw.close();
        }


    }

    static class Print implements Runnable {
        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int receive = 0;
            try {
                while ((receive = in.read()) != -1) {
                    System.out.println((char) receive);
                }
            } catch (Exception e) {

            }
        }
    }
}
