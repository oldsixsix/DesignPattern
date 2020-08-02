package com.doublestrong.JVM.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Double strong
 * @date 2020/7/14 9:39
 */
public class TwoPhaseTeminationTest {
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTemination twoPhaseTemination = new TwoPhaseTemination();
        twoPhaseTemination.run();
        Thread.sleep(3500);
        twoPhaseTemination.stop();
    }
}
@Slf4j(topic = "c.1")
class  TwoPhaseTemination{
//    需要监控的线程
    private Thread monitor;
    //启动监控线程
    public void run(){
        monitor=new Thread(()->{
            while (true)
            {
                Thread currentThread = Thread.currentThread();
//               判断当前线程是否被打断
                if(currentThread.isInterrupted())
                {
//                    如果被打断，料理后事
                    log.debug("料理后事");
                    break;
                }
                try {
                    Thread.sleep(1000);//情况1
                    log.debug("执行监控记录");//情况2
                }
                catch (Exception e)
                {
                    //如果打断了，抛出异常重新设置打断记录
                    e.printStackTrace();
//                    重新设置打断记录
//                    打断 sleep (阻塞的，会抛出InterruptedException )的线程, 会清空打断状态(置为false)，以 sleep 为例
//                    打断正在运行过的线程 不会情况打断标记置位true
                    currentThread.interrupt();//true
                }

            }

        });
        monitor.start();
    }

    public void stop(){
        monitor.interrupt();

//        1.打断阻塞（sleep wait join）的线程时，，打断标记会被清空为false，因为本来就是阻塞的，也没有执行打断成功，会抛出InterruptedException
//        2.打断正在运行时的线程以及park停止方法，打断标记为true，确实打断了
//        stop，suspend,resume已经过时了，stop取代它的是两阶段终止模式，以一种优雅的方式在T1中停止T2线程
    }
}
