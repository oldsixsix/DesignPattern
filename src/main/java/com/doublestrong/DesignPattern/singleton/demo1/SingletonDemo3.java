package com.doublestrong.DesignPattern.singleton.demo1;

/**
 * @author Double strong
 * @date 2020/3/5 20:31
 * DCL懒汉式
 * 双重检查
 */
public class SingletonDemo3 {

//    1.私有化构造器
    private SingletonDemo3(){}

//    2.类初始化的时候不立即加载该对象
//
    /*
       volatile
    保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。（实现可见性）
    一个线程如果改变了某个变量的值，在另一个线程中这个值立刻生效，可见
    * */
    public volatile static SingletonDemo3  instance;

//    3.提供获取该对象的方法
//    因为同步方法需要排队效率低
    public   static SingletonDemo3 getInstance(){
        if(instance==null)
        {
            //加一个同步锁，锁的是单例类
            /*
            * ，针对每个类也有一个锁，可以称为“类锁”，类锁实际上是通过对象锁实现的，即类的 Class 对象锁。每个类只有一个 Class 对象，所以每个类只有一个类锁。
            * */
//            采用类锁一次只能通过一个，一个类只有一个class对象，所以所有的异步方法都会在这个锁这里再进行同步判断
//            即让异步方法刚开始都进入方法中执行，然后第一个进去的返回单例，后面的再一个个判断
//           没有锁方法，是锁的类对象
            synchronized (SingletonDemo3.class){
                //如果能进来，表示第一个进入这个锁的
                if (instance==null)
                {
                    instance=new SingletonDemo3();
                }
            }
        }
        return instance;
    }
}
