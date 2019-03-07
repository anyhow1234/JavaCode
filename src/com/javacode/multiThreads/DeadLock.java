package com.javacode.multiThreads;

import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author hans
 * @Date 2019/3/6 23:26
 * @Version 1.0
 */
public class DeadLock {
    static DeadLock lock = new DeadLock();
    public static void lockObject1(){
        synchronized(lock){
            try {
                System.out.println(Thread.currentThread().getName() + "执行lockObject1方法" +  "获取到了 ： lock");
                Thread.sleep(1000);
                synchronized(DeadLock.class){
                    System.out.println(Thread.currentThread().getName() + "执行lockObject1方法" + "获取到了 ： DeadLock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void lockObject2(){
        try {
            System.out.println(Thread.currentThread().getName() + "执行lockObject2方法" + "获取到了 ： DeadLock");
            Thread.sleep(1000);
            synchronized(lock){
                System.out.println(Thread.currentThread().getName() + "执行lockObject2方法" + "获取到了 ： lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lockObject1();
//            }
//        }).start();
//        new Thread(){};
        new Iterable<String>(){
            @Override
            public Iterator<String> iterator() {
                return null;
            }
            void sayHi(){
                System.out.println("HI");
            }
        }.sayHi();
//        new Thread(() -> {
//            lockObject2();
//        }).start();

    }
}