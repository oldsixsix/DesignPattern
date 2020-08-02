package com.doublestrong.DesignPattern.builderPattern;

/**
 * @author Double strong
 * @date 2020/6/9 9:59
 */
public class Client {
    public static void main(String[] args) {
        IBuilderHuman builderHuman=new FatHuman();
//        传入的是接口，便于重构以及扩展子类，每次传入接口，但实际上达到的效果是传入子类
        HumanDirector humanDirector = new HumanDirector(builderHuman);
        Human human = humanDirector.createHuman();
        System.out.println(human);
    }
}
