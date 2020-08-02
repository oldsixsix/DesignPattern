package com.doublestrong.JUC.Demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Double strong
 * @date 2020/7/3 15:13
 */
@Slf4j(topic = "c.Test1")
public class Test1 {
    public static void main(String[] args) {
//        主方法默认在一个线程中
//
//        Runnable表示线程中要执行的任务，即要执行的代码
        Runnable runnable= () -> {
//                要执行的任务
            log.debug("runnable");
        };
        Thread t=new Thread(runnable);
        t.setName("thread1");
        t.start();
        log.debug("running1");

//        FutureTask<返回结果类型>
        FutureTask<Integer> task=new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
              log.debug("futureTask");
              Thread.sleep(5000);
                return 123;
            }
        });
        Thread thread= new Thread(task,"futureTask");
        thread.start();
        try {
            Integer integer = task.get();
         log.debug(integer.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
