package com.doublestrong.DesignPattern.observerPattern.Demo2;

/**
 * @author Double strong
 * @date 2020/6/9 16:29
 */
public class NbaObeserver extends Observer {
    private String name;
    private Subject subject;

    public NbaObeserver(String name, Subject subject) {
        super(name,subject);
        this.name=name;
       this.subject=subject;
    }


    @Override
    public void Update() {
        System.out.println(subject.getAction()+"----"+name+"关直播");
    }
}
