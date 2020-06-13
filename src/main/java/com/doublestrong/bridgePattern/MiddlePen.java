package com.doublestrong.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/11 20:15
 */
public class MiddlePen extends Pen {

    @Override
    public void draw(String name) {
        System.out.println("中号毛笔绘制");
        String penType="中号毛笔";
        this.color.bePaint(penType,name);
    }
}
