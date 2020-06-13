package com.doublestrong.observerPattern.Demo2;

import lombok.Data;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Double strong
 * @date 2020/6/9 16:20
 * 抽象主题类，用于发布通知
 */
@Data
public  abstract class Subject {

    public String action;
//    添加观察者，删除观察者，通知观察者
    public  abstract void  Attach(Observer observer);

    public  abstract void  Detach(Observer observer);
//  通知列表里的观察者
    public abstract void Notify();
}
