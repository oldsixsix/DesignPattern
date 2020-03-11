package com.doublestrong.singleton.demo1;

/**
 * @author Double strong
 * @date 2020/3/5 20:14
 * 懒汉式
 * 类加载的时候没有立即创建对象，主动获取的时候才创建实例，
 */
public class SingletonDemo2 {
//    1.私有化构造器，防止外部创建多个对象
    private SingletonDemo2(){}

//    2.类初始化的时候不立即加载该对象
    private static SingletonDemo2 instance;

    //3.提供获取该对象的方法，
//    synchronized 懒汉式，如果有多个线程同时键入这个方法，这个实例就不安全了。所以要加上同步synchronized，该方法只能排队执行
//    synchronized同步方法需要排队效率较差
    public static synchronized SingletonDemo2 getInstance(){
        if(instance==null)
        {
            instance=new SingletonDemo2();
        }
        return instance;
    }
}
