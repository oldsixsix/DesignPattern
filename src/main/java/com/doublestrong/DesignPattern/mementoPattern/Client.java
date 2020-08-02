package com.doublestrong.DesignPattern.mementoPattern;

/**
 * @author Double strong
 * @date 2020/6/13 13:05
 */
public class Client {
    public static void main(String[] args) {
//        发起人初始化状态
        Originator originator = new Originator();
        originator.setVit(100);
        originator.setAtk(100);
        originator.setDef(100);

//        创建备忘录
        Memento memento = originator.saveState();
//        将备忘录保存到备忘录管理者中
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        originator.Fight();
//        打架后
        System.out.println("打架后");
        System.out.println(originator);

        System.out.println("恢复状态");
        originator.RecoveryState(caretaker.getMemento());
        System.out.println(originator);
    }
}
