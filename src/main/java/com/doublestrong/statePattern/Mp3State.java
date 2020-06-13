package com.doublestrong.statePattern;

/**
 * @author Double strong
 * @date 2020/6/12 12:43
 * 抽象状态角色
 * 接口Mp3State中定义了四种功能
 */
public interface Mp3State {
    //开机
    public void powerOn();
    //关机
    public void powerOff();
    //上一首歌曲
    public void preSong();
    //下一首歌曲
    public void nextSong();
}
