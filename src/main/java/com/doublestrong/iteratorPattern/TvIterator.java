package com.doublestrong.iteratorPattern;

import java.util.List;

/**
 * @author Double strong
 * @date 2020/6/14 10:42
 */
public class TvIterator implements Iterator
{
//    在具体迭代器中声明 具体聚合类的引用
    Tv tv;
    List<String> list;
    int index=0;
    int length=0;

    public TvIterator(Tv tv)
    {
        this.tv=tv;
//        获取聚合类中的集合数据
        this.list=tv.getChannels();
//        获取集合长度，用于判断集合中是否有下一个元素
        length=list.size();
    }
    public Object next(){
        return list.get(index++);
    }
    public boolean hasNext(){
        if(index>=length){
            return false;
        }
        else{
            return true;
        }
    }

}
