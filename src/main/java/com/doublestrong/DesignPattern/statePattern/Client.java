package com.doublestrong.DesignPattern.statePattern;

/**
 * @author Double strong
 * @date 2020/6/12 12:57
 */
public class Client {
    public static void main(String[] args) {
        //    关机状态下
        Context context=new Context(new PowerOffState());
        context.preSong();
        context.nextSong();
        context.powerOff();
        context.powerOn();

//        开机状态下
        Context context1=new Context(new PowerOnState());
        context1.preSong();
        context1.nextSong();
        context1.powerOff();
        context1.powerOn();

    }
}
