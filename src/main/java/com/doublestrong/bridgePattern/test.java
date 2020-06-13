package com.doublestrong.bridgePattern;

/**
 * @author Double strong
 * @date 2020/3/16 14:32
 */
public class test {
    public static void main(String[] args) {
        Pen pen=new MiddlePen();
        pen.setColor(new Green());
        pen.draw("123");
    }
}
