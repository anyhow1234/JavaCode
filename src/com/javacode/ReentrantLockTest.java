package com.javacode;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Author hans
 * @Date 2019/2/20 21:00
 * @Version 1.0
 */
public class ReentrantLockTest implements Runnable {

    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

//        while (true) {
            synchronized (this) {
                try {
                    System.out.println(Thread.currentThread().getName() + " get lock!");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//        }
        /*while (true) {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " get lock!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }*/
    }

    public static void main(String[] args) {
        ReentrantLockTest test = new ReentrantLockTest();
        new Thread(test).start();
        new Thread(test).start();
    }
}
