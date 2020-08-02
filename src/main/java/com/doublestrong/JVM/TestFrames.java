package com.doublestrong.JVM;

/**
 * @author Double strong
 * @date 2020/7/3 22:10
 */
public class TestFrames {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                method1(20);
            }
        };
        thread.setName("t1");
        thread.start();
        method1(10);
    }

    private static void method1(int x)
    {
        int y=x+1;
        Object m=method2();
        System.out.println(m);
    }
    private static Object method2(){
        Object o = new Object();
        return o;
    }
}
