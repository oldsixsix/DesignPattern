package com.doublestrong.JVM;

/**
 * @author Double strong
 * @date 2020/6/29 16:29
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
//StringTable=["a","b","ab"]
//     s1,s2,s3,s5都为串池中对象
//     s4是字符串变量拼接，用的是StringBuilder+append+toString方法
//     s6是字符串常量池的对象，intern方法返回的
//       由于字符串池中原本就有"ab"，所以s4还是在堆中，没有放到串池中
        String s1="a";
        String s2="b";
        String s3="a"+"b";
        String s4=s1+s2;
        String s5="ab";
        String s6=s4.intern();

//        问题
        System.out.println(s3==s4); //false
        System.out.println(s3==s5); //true
        System.out.println(s3==s6);//true

        String x2=new String("c")+new String("d");
        String x1="cd";
        x2.intern();
        System.out.println(x1==x2);//flase
//        字符串池中有cd,x1为串池中对象，x2为堆中对象



    }
}
