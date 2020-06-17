package com.doublestrong.singleton.demo1;

/**
 * @author Double strong
 * @date 2020/3/5 20:00
 * 饿汉式单例 静态常量
 * 类加载时就创建其单例对象
 */
public class SingletonDemo1 {
//    1.私有化构造器，防止外部创建多个对象
    private SingletonDemo1(){

    }
//    2，类初始化的时候就是立即加载该对象
//    创建一个单例对象,只能在内部创建其实例对象
    private  static final SingletonDemo1  instance= new SingletonDemo1();

//    3.提供获取该对象的方法
//    这个同步异步均可，返回的是类加载时就已经创建好的单例
    public static SingletonDemo1 getInstance(){
        return instance;
    }

}
