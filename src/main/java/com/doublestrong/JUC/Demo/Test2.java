package com.doublestrong.JUC.Demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Double strong
 * @date 2020/7/3 15:54
 * 证明CPU轮转时间片执行线程
 */
@Slf4j
public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.debug("t1--running");
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                log.debug("t2--running");
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
