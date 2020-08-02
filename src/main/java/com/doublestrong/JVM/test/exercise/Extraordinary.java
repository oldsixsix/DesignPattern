package com.doublestrong.JVM.test.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * @author Double strong
 * @date 2020/7/18 11:51
 *
 * 多线程情况下的超卖现象
 */
@Slf4j
public class Extraordinary {
    public static void main(String[] args) {
//    模拟多线程环境下的售票情况
        ticketWindow ticketWindow=new ticketWindow(500);
//        创建多线程
        List<Thread> list=new ArrayList<>();
//        统计卖票数总额
        List<Integer> sellCount=new Vector<>();
        for (int i = 0; i < 4000; i++) {
            Thread t=new Thread(()->{
//                线程中进行售票,卖随机数量
                int sell = ticketWindow.sell(randomAmount());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sellCount.add(sell);
            });
            list.add(t);
            t.start();
        }
//        必须等到所有线程执行完了，再来统计卖票数量
        for (Thread thread : list) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        统计卖票数量
        log.debug("selled count:{}",sellCount.stream().mapToInt((c -> c)).sum());
        log.debug("remainder count:{}", ticketWindow.getCount());
        /*
        总共500张，卖出来502张票
        12:07:59.920 [main] DEBUG com.doublestrong.JVM.test.exercise.Extraordinary - selled count:502
        12:07:59.927 [main] DEBUG com.doublestrong.JVM.test.exercise.Extraordinary - remainder count:0

        * */

    }

    static Random random = new Random();
    // 随机 1~5
    public static int randomAmount() {
        return random.nextInt(5) + 1;
    }
}
