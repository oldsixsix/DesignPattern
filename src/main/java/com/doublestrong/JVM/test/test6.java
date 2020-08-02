package com.doublestrong.JVM.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Double strong
 * @date 2020/7/4 13:14
 */
@Slf4j
public class test6 {
    public static void main(String[] args) {
        Thread thread = new Thread("t1") {
            @Override
            public void run() {
                try {
                    log.debug("enter sleep");
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
//                    如果睡眠被打断就会抛出InterruptedException异常
                    log.debug("wake up");
                    e.printStackTrace();
                }
                finally {
                }
            }
        };
        thread.start();
        try {
            Thread.sleep(500);
            log.debug("interrupt");
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.debug(thread.getState().toString());
//        sleep状态
//        DEBUG com.doublestrong.JVM.test.test6 - TIMED_WAITING

    }
}
