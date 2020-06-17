package com.doublestrong.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/16 14:32
 */
public class test {
    public static void main(String[] args) {
        Pen pen=new MiddlePen();
//        传入这个关联关系
        pen.setColor(new Red());
        pen.draw("123");
    }
}
