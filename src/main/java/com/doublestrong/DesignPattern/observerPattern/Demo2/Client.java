package com.doublestrong.DesignPattern.observerPattern.Demo2;

/**
 * @author Double strong
 * @date 2020/6/9 16:43
 */
public class Client {

    public static void main(String[] args) {

        Boss boss = new Boss();
        NbaObeserver wzz = new NbaObeserver("wzz", boss);
        StockObserver gyy=new StockObserver("gyy",boss);
        boss.setAction("老板来了");
        boss.Attach(wzz);
        boss.Attach(gyy);
        boss.Notify();

        Secretary secretary = new Secretary();
        StockObserver gyy1=new StockObserver("gyy",secretary);
        secretary.setAction("秘书：老板来了");
        secretary.Attach(wzz);
        secretary.Attach(gyy1);
        secretary.Notify();

    }
}
