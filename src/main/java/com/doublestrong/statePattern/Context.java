package com.doublestrong.statePattern;

import lombok.Data;

/**
 * @author Double strong
 * @date 2020/6/12 12:52
 * 维护一个State对象的实例
 */
@Data
public class Context {
    private Mp3State mp3State;
    public  Context(Mp3State state)
    {
        this.mp3State=state;
    }
//   调用相关方法并且设定相关状态
//    进行状态切换
    public void powerOn(){
        mp3State.powerOn();
        setMp3State(new PowerOnState());
    }
    public void powerOff(){
        mp3State.powerOff();
        setMp3State(new PowerOffState());
    }
    public void preSong(){
        mp3State.preSong();
    }
    public void nextSong(){
        mp3State.nextSong();
    }

}
