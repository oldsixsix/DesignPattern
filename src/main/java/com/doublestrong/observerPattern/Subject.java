package com.doublestrong.observerPattern;

import java.util.*;

/**
 * @author Double strong
 * @date 2020/3/1 13:05
 * 抽象主题类，抽象通知者类
 */
public interface  Subject {
    //添加观察者
    public void registerObserver(Observer o);
    //删除观察者
    public void removeObserver(Observer o);

    //通知方法
    public void notifyObserver();

}
