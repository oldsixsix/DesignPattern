package com.doublestrong.DesignPattern.observerPattern.Demo2;

/**
 * @author Double strong
 * @date 2020/6/9 16:21
 */
public abstract  class Observer {
    private String name;
    private Subject subject;
    public  Observer(String name,Subject subject)
    {
        this.name=name;
        this.subject=subject;
    }

    public abstract void Update();
}
