package com.doublestrong.DesignPattern.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/11 20:19
 */
public class Green implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println("绿色");
    }
}
