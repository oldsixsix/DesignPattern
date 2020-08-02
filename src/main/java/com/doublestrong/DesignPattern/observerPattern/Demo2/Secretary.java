package com.doublestrong.DesignPattern.observerPattern.Demo2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Double strong
 * @date 2020/6/9 16:38
 * 具体通知类2 秘书类
 */
@Data
public class Secretary extends Subject{
    //    观察者/订阅者集合
    List<Observer> observerList=new ArrayList<>();
    String action;
//  抽象主题只定义了一个接口，实现交由具体类
    @Override
    public void Attach(Observer observer) {
            observerList.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void Notify() {
        for (Observer observer : observerList) {
            observer.Update();
        }
    }
}
