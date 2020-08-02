package com.doublestrong.JUC.ReentrantLock;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 *  Synchronized下的死锁例子：不可被打断
 *  这样的死锁不能被打断
 *
 */
@Slf4j
public class SynchronizedDeadLock   implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new SynchronizedDeadLock(true));
        t1.setName("A");
        Thread t2 = new Thread(new SynchronizedDeadLock(false));
        t2.setName("B");
        t1.start();
        t2.start();
        log.info("死锁状态了");
        log.info("尝试打断");
        t1.interrupt();
    }

    private boolean flag;
    //锁1
    private static Object lock1 = new Object();
    //锁2
    private static Object lock2 = new Object();

    public SynchronizedDeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (lock1) {
                System.out.println("线程 ： " + Thread.currentThread().getName() + " get lock1");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //尝试获取lock2
                System.out.println("线程 :  "+ Thread.currentThread().getName()+" waiting get lock2");
                synchronized (lock2) {
                    System.out.println("线程 ： " + Thread.currentThread().getName() + " get lock1");
                }
            }
        } else {
            synchronized (lock2) {
                System.out.println("线程 ： " + Thread.currentThread().getName() + " get lock2");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //尝试获取锁1
                System.out.println("线程 :  "+ Thread.currentThread().getName()+" waiting get lock1");
                synchronized (lock1) {
                    System.out.println("线程 ： " + Thread.currentThread().getName() + " get lock1");
                }
            }
        }
    }
}
