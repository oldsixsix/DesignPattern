package com.doublestrong.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/11 20:12
 */
public abstract class Pen {
//    建立一个与实现类接口的关联关系
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void draw(String name);
}
