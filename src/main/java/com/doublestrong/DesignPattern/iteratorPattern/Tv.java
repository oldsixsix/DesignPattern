package com.doublestrong.DesignPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Double strong
 * @date 2020/6/14 10:43
 */
public class Tv implements Aggregate {

//    具体聚合类中封装集合数据
    List<String> channels=new ArrayList<>();


    //具体聚合类中实现创建具体迭代器的方法
    @Override
    public Iterator createIterator() {
        return new TvIterator(this);
    }

    public void addChannel(String channel){
        channels.add(channel);
    }

    public List<String> getChannels(){
        return channels;
    }

}
