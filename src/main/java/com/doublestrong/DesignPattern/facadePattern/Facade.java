package com.doublestrong.DesignPattern.facadePattern;

/**
 * @author Double strong
 * @date 2020/2/29 11:28
 * 外观类需要了解子系统的所有方法和属性，进行业务组合，供客户端调用
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;
    public Facade() {
        one =new SubSystemOne();
        two =new SubSystemTwo();
        three=new SubSystemThree();
        four=new SubSystemFour();
    }

//    业务组合A
    public void methodA(){
        System.out.println("业务A");
        one.method();
        four.method();
    }

    //    业务组合B
    public void methodB(){
        System.out.println("业务B");
        one.method();
        two.method();
        three.method();
        four.method();
    }

}
