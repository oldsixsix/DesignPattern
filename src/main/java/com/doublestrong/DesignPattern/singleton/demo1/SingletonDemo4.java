package com.doublestrong.DesignPattern.singleton.demo1;

/**
 * @author Double strong
 * @date 2020/3/5 20:51
 * 静态内部类式
 * 1.满足了延迟加载，用的时候申请资源
 * 2.保证了线程安全，只有一个单例对象，保证了线程安全
 * 3.并发情况下，也能高效率
 *
 */
public class SingletonDemo4 {
    private SingletonDemo4(){}

//    静态内部类
    /*
    * 当内部类是static时，意味着：
   [1]创建静态内部类的对象不需要其外部类
   [2]静态内部类不能访问外部类的非静态成员 （不能够从静态内部类的对象中访问外部类的非静态成员）；
    * */
    private static class innerClass{
//        static final 保证该实例在内存中只有一个，且只初始化一次
//    并发情况下，谁最先调用，谁进行初始化，后面的就都用第一次初始化的实例
        private static final SingletonDemo4 instance=new SingletonDemo4();
    }
    public static SingletonDemo4 getInstance(){
        return innerClass.instance;
    }
}
