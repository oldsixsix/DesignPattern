package com.doublestrong.builderPattern;

/**
 * @author Double strong
 * @date 2020/3/1 11:41
 */
public class HumanDirector {
    private  IBuilderHuman iBuilderHuman;
//把要画出的具体的人传递给指挥者，指挥者按照标准的建造流程进行施工
    public HumanDirector(IBuilderHuman iBuilderHuman) {
        this.iBuilderHuman = iBuilderHuman;
    }
    public Human createHuman(){

        iBuilderHuman.buildHead();
        iBuilderHuman.buildBody();
        iBuilderHuman.buildHand();
        iBuilderHuman.buildFoot();
       return iBuilderHuman.createHuman();
    }
}
