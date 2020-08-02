package com.doublestrong.DesignPattern.builderPattern;

/**
 * @author Double strong
 * @date 2020/3/1 11:35
 */
public class FatHuman implements IBuilderHuman {
    Human human;

    public FatHuman(){
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("普通的头脑");
    }

    @Override
    public void buildBody() {
        human.setBody("肥胖的身体");

    }

    @Override
    public void buildHand() {
        human.setHand("新的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("新的脚");

    }

    @Override
    public Human createHuman() {
        return human;
    }

}
