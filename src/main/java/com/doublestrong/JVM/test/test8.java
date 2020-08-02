package com.doublestrong.JVM.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Double strong
 * @date 2020/7/14 12:15
 */
@Slf4j
public class test8 {
    public static void main(String[] args) {
        Thread t1= new Thread(()->{
            log.debug("洗水壶");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("烧开水");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"老王");

        Thread t2=new Thread(()->{
            log.debug("洗茶壶");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("洗茶杯");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("拿茶叶");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
//                等待水开了，就可以泡茶了
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.debug("泡茶");
        });

        t1.start();
        t2.start();
    }
}
