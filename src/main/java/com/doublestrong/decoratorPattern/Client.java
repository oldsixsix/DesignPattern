package com.doublestrong.decoratorPattern;

/**
 * @author Double strong
 * @date 2020/6/6 9:53
 */
public class Client {
    public static void main(String[] args) {
        //            客户可以按照自己的想法动态的给对象添加职责
//        定义一个具体的对象，用多态定义，这里用到了依赖倒置原则
        AbstractComponent concreteComponent = new ConcreteComponent();
        System.out.println(concreteComponent.getMsg()+"价格"+concreteComponent.getPrice());
//            添加职责
        System.out.println("加鸡蛋");
//        将对象传入具体装饰类，装饰类在对象不改变的基础上，添加一些新的职责/功能
        concreteComponent=new Egg(concreteComponent);
        concreteComponent=new Egg(concreteComponent);
        System.out.println(concreteComponent.getMsg()+"价格"+concreteComponent.getPrice());
        System.out.println("加香肠");
        concreteComponent=new sausage(concreteComponent);
        System.out.println(concreteComponent.getMsg()+"价格"+concreteComponent.getPrice());
    }
}
