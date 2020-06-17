package com.doublestrong.iteratorPattern;

/**
 * @author Double strong
 * @date 2020/6/14 10:48
 */
public class Client {
    public static void main(String[] args) {
//        创建聚合类
        Tv tv = new Tv();
//        添加数据到聚合类中
        tv.addChannel("湖南");
        tv.addChannel("湖北");
        tv.addChannel("浙江");
        tv.addChannel("上海");
//        创建它的迭代器
        Iterator iterator = tv.createIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()+"卫视");
        }
    }
}
