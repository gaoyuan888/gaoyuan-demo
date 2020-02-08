package cn.gaoyuan.demo.atguigu;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/29 18:12
 * @desc
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyShareData data=new MyShareData();

        for (int i = 0; i <15 ; i++) {
            new Thread(()->{
                data.getValue();
            }).start();
        }

        new Thread(()->{
            data.setValue(15);
        }).start();




    }



}

class MyShareData {
    private int value = 0;
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    public void getValue() {
        readWriteLock.readLock().lock();
        try {
            System.out.println("read" + value);
        } finally {
            readWriteLock.readLock().unlock();
        }

    }

    public void setValue(int value) {
        readWriteLock.writeLock().lock();
        try {
            this.value = value;
            System.out.println("write" + value);
        } finally {
            readWriteLock.writeLock().unlock();
        }


    }
}
