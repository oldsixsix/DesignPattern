package com.doublestrong.JVM.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Double strong
 * @date 2020/7/4 15:39
 */
@Slf4j
public class test7 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread("t1") {
            @Override
            public void run() {
                //                    被打断的线程需要自己执行打断这个过程
//                在线程内部执行获取打断标记
                boolean interrupted = Thread.currentThread().isInterrupted();
//                打断了为true
                while (interrupted){
//                    interrupt只是告诉你我要打断你
                    log.debug("被打断了");
                    break;
                }
//                try {
//                    log.debug("enter sleep");
//                    Thread.sleep(3000);
//
//                } catch (InterruptedException e) {
////                    如果睡眠被打断就会抛出InterruptedException异常
//                    e.printStackTrace();
//                }

            }
        };
        thread.start();
        Thread.sleep(500);
        log.debug("interrupt");
        thread.interrupt();
        log.debug("打断标记：{}",thread.isInterrupted());
    }

}
