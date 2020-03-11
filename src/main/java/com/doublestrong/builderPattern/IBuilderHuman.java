package com.doublestrong.builderPattern;

/**
 * @author Double strong
 * @date 2020/3/1 11:33
 * 定义画人的接口，具体实现交给其子类实现
 */
public interface IBuilderHuman {


    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();
    public Human createHuman();

}
