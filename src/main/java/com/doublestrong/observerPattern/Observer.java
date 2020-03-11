package com.doublestrong.observerPattern;

/**
 * @author Double strong
 * @date 2020/3/1 13:07
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 */
public interface Observer {
    public void Update(String message);
}
