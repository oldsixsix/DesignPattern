package com.doublestrong.DesignPattern.observerPattern.Demo1;

/**
 * @author Double strong
 * @date 2020/3/1 13:38
 * 具体观察者1
 */
public class UserOne implements Observer {
    private String name;
    private String message;

    public UserOne(String name) {
        this.name = name;
    }

    @Override
    public void Update(String message) {
        this.message = message;
        read();
    }
    public void read(){
        System.out.println(name + " 收到推送消息： " + message);
    }
}
