package com.doublestrong.mementoPattern;

import lombok.Data;
import lombok.ToString;

/**
 * @author Double strong
 * @date 2020/6/13 12:52
 * 发起者，负责创建一个备忘录，并且可以记录、恢复自身的内部状态。可以根据需要决定`Memento`保存自身的那些内部状态
 */
@Data
@ToString
public class Originator {
    private int vit;
    private int atk;
    private int def;

//    1.发起者传入当前状态创建一个备忘录
    public Memento saveState()
    {
        return new Memento(vit,atk,def);
    }
//    将发起者状态恢复到备忘录所记录状态
    public void RecoveryState(Memento memento)
    {
        this.vit=memento.getVit();
        this.atk=memento.getAtk();
        this.def=memento.getDef();
    }

    public void  Fight(){

        this.vit=20;
        this.atk=10;
        this.def=0;

    }
}
