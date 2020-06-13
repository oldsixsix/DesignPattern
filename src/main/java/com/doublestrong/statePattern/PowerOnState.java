package com.doublestrong.statePattern;

/**
 * @author Double strong
 * @date 2020/6/12 12:45
 * 实现开机状态下的所有功能
 * 就是将特定状态的相关
 */
public class PowerOnState  implements Mp3State {
    @Override
    public void powerOn() {
        System.out.println("已开机");
    }
    @Override
    public void powerOff() {
        System.out.println("关机");
    }
    @Override
    public void preSong() {
        System.out.println("上一首歌");
    }
    @Override
    public void nextSong() {
        System.out.println("下一首歌");
    }

}
