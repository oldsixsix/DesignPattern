package com.doublestrong.DesignPattern.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/11 20:15
 */
public class SmallPen extends Pen {

    @Override
    public void draw(String name) {
        System.out.println("小号毛笔绘制");
        String penType="小号毛笔";
        this.color.bePaint(penType,name);
    }
}
