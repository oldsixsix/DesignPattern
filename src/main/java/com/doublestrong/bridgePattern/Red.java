package com.doublestrong.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/11 20:18
 */
public class Red implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"----"+name+"红色");
    }
}
