package com.doublestrong.observerPattern.Demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Double strong
 * @date 2020/3/1 13:21
 * 定义一个微信公众号服务，为具体通知者类用于给其订阅（观察）的具体类发送通知
， */
public class WechatServer  implements Subject{
    //注意到这个List集合的泛型参数为Observer接口，
//    设计原则：面向接口编程而不是面向实现编程
//    该集合用于存储该服务的观察者
    private List<Observer> observers;
    private String message;

    public WechatServer() {
        this.observers =new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
//            回调observer的update方法，通知所有观察者/订阅者
            observer.Update(message);
        }

    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }

}
