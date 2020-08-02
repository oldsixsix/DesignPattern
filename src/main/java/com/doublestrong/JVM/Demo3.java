package com.doublestrong.JVM;

/**
 * @author Double strong
 * @date 2020/6/29 17:20
 *
 * intern 方法的例子
 */
public class Demo3 {
    public static void main(String[] args) {
        //串池中有["a","b"]
//        String x="ab";
     String s = new String("a") + new String("b");
//     运行时堆中 new String("a") new String("b"); 值与串池中相同，但是地址不同
//        String s= new ("ab") 两个堆中对象在运行时做拼接用的StringBuilder. append +toString
//        s="ab" 仅仅存在于堆中，字符串常量池中没有
        System.out.println(s=="ab");
        String s2 = s.intern();//该方法就是将这个字符串对象尝试放入串池
        // ，如果有则不会放入，如果没有则把s放入串池，并且不管有没有会把串池中的对象返回
//    s2="ab" ，就是串池中的ab对象
//        如果串池中没有就是把s这个对象放入串池中，s==s2 true
//        如果串池中没有就不把s放入串池中 s≠s2,s是堆中过的对象，s2是串池中的对象
        System.out.println(s=="ab");
        System.out.println(s2=="ab");
    }
}
