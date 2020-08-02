package com.doublestrong.JUC.ReentrantLock;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@Slf4j
public class ReentrantLockDeadLock implements Runnable {
    private boolean flag;
    //锁1
    private static ReentrantLock lock1 = new ReentrantLock();
    //锁2
    private static ReentrantLock lock2 = new ReentrantLock();

    public ReentrantLockDeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            if (flag) {
                //获取锁
//                这里使用的是可中断锁
                lock1.lockInterruptibly();
                System.out.println("线程 ： " + Thread.currentThread().getName() + " get lock1");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("线程 ： " + Thread.currentThread().getName() + " try to get lock2");
                lock2.lockInterruptibly();
            } else {
                lock2.lockInterruptibly();
                System.out.println("线程 ： " + Thread.currentThread().getName() + " get lock2");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("线程 ： " + Thread.currentThread().getName() + " try to get lock1");
                lock1.lockInterruptibly();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //如果当前线程持有锁1,释放锁1
            if (lock1.isHeldByCurrentThread()) {
                lock1.unlock();
            }
            //如果当前线程持有锁2,释放锁2
            if (lock2.isHeldByCurrentThread()) {
                lock2.unlock();
            }
            System.out.println("线程 ： " + Thread.currentThread().getName() + " 退出");
        }
    }
/*
* 线程A获取锁1，线程B获取锁2，线程A尝试获取锁2，线程B尝试获取锁1，
* 两个线程相互等待对方持有的锁，故形成了死锁。此时 main函数中，调用线程B的interrupt 中断线程，
* 线程B响应中断，最后两个线程都相继退出。真正完成任务只有线程A,线程B首先响应中断，放弃任务直接退出，释放资源。
* */
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ReentrantLockDeadLock(true));
        t1.setName("A");
        Thread t2 = new Thread(new ReentrantLockDeadLock(false));
        t2.setName("B");
        t1.start();
        t2.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("线程B设置中断标记，线程B将退出死锁状态");
//        在这里可以把重入锁的死锁状态打断，且线程A
        t2.interrupt();

    }
}
