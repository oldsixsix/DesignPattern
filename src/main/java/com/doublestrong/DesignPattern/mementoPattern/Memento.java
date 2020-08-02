package com.doublestrong.DesignPattern.mementoPattern;

import lombok.Data;

/**
 * @author Double strong
 * @date 2020/6/13 12:53
 * 将要存储的状态封装到memento
 */
@Data
public class Memento {
//    分别存储生命力 攻击力 防御力三种状态
    private int vit;
    private int atk;
    private int def;
    public Memento( int vit, int atk, int def)
    {
        this.vit=vit;
        this.atk=atk;
        this.def=def;
    }

}
