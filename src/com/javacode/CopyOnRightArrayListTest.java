package com.javacode;

import java.util.Iterator;
import java.util.Vector;

/**
 * @Description:
 * @Author hans
 * @Date 2019/2/20 00:37
 * @Version 1.0
 */
public class CopyOnRightArrayListTest {
    public static Object getLast(Vector list){
        synchronized (list){
            int  lastIndex = list.size() - 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return list.get(lastIndex);
        }

    }
    public static void  removeLast(Vector list){
        synchronized (list){
            int lastIndex = list.size() - 1;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
            list.remove(lastIndex);
        }

    }

    public static void main(String[] args) {

        Vector<String> list = new Vector<>();
        for (int i = 0 ; i < 15 ; i++){
            list.add("a");
        }

//        for (int i = 0 ; i < 14000 ; i++){
//            new Thread(() -> getLast(list)).start();
//            new Thread(() -> removeLast(list)).start();
//            new Thread(() -> list.clear()).start();
//            list.clear();
//        }

        for(String s : list){
            removeLast(list);
        }

//        removeLast(list);
        System.out.println(list.size());
    }
}
