package com.doublestrong.JVM;

/**
 * @author Double strong
 * @date 2020/6/29 17:07
 */

/**
 * 字符串的延迟加载特性
 */
public class Demo2 {
    public static void main(String[] args) {
        int x=args.length;
        System.out.println();
//        由此可以发现字符串是执行的时候才进行加载的
                              //字符串个数2267
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");
        System.out.print("6");
        System.out.print("7");
        System.out.print("8");
        System.out.print("9");
        System.out.print("0");
        System.out.print("1"); //字符串个数2277
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");
        System.out.print("6");
        System.out.print("7");
        System.out.print("8");
        System.out.print("9");


    }
}
