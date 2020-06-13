package com.doublestrong.observerPattern.Demo2;

/**
 * @author Double strong
 * @date 2020/6/9 17:21
 */
public class StockObserver extends Observer {
    private String name;
    private Subject subject;

    public StockObserver(String name, Subject subject) {
        super(name,subject);
        this.name=name;
        this.subject=subject;
    }
    @Override
    public void Update() {
        System.out.println(subject.getAction()+"----"+name+"关股票");
    }
}
