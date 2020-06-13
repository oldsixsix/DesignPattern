package com.doublestrong.decoratorPattern.demo2;

/**
 * @author Double strong
 * @date 2020/6/6 10:07
 */
public class Client {
    public static void main(String[] args) {
        Cake cake=new Cake();
        cake=new Egg(cake);
        cake=new Egg(cake);
        System.out.println(cake.getMsg());
    }
}
