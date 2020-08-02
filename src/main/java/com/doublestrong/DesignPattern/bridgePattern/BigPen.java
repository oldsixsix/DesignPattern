package com.doublestrong.DesignPattern.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/11 20:15
 */
public class BigPen extends Pen {

    @Override
    public void draw(String name) {
        System.out.println("大号毛笔绘制");
        String penType="大号毛笔";
        this.color.bePaint(penType,name);
    }
}
