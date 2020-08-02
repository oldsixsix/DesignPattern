package com.doublestrong.DesignPattern.builderPattern;

/**
 * @author Double strong
 * @date 2020/3/1 11:33
 * 定义画人的接口，具体实现交给其子类实现
 *  * 给出一个抽象接口，以规范产品对象的各个组成成分的建造。
 *  * 这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。
 */
public interface IBuilderHuman {


    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();
    public Human createHuman();

}
