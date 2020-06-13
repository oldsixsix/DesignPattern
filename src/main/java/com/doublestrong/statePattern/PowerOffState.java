package com.doublestrong.statePattern;

/**
 * @author Double strong
 * @date 2020/6/12 12:51
 * 关机状态
 * 在关机状态中只
 * 现了powerOn方法，其他的方法都是空实现。
 */
public class PowerOffState implements Mp3State {
    @Override
    public void powerOn() {
        System.out.println("开机");
    }
    @Override
    public void powerOff() {
        System.out.println("MP3已关机");
    }
    @Override
    public void preSong() {
        System.out.println("MP3已关机");
    }
    @Override
    public void nextSong() {
        System.out.println("MP3已关机");
    }
}