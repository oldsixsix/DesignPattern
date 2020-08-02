package com.doublestrong.JVM;

/**
 * @author Double strong
 * @date 2020/6/29 16:42
 *
 */
public class Demo1 {
    /*
    * 1. 常量池中的字符串仅仅是符号，第一次用到时才变成对象
    * 2. 利用串池的机制，来避免重复创建字符串对象，串池中的每一个字符串只有一份
    * 3. 字符串变量的拼接原理是StringBuilder中的 append +toString(new String对象)
    *    字符串变量拼接后其结果就是new了一个String对象放到堆中
    * 4. 字符串常量的拼接原理是 javac的编译器优化，其还是查的字符串常量池中的对象
    * 5. 可以使用intern方法，主动将串池中还没有的字符串对象放入串池,此时该对象就变成串池中的对象
    *       并且s2=s.intern(); 如果串池中没有，s2和s指向同一个串池中的对象
    *                         如果串池中有，则s指向堆中，s2指向串中，s≠s2
    *
    * */



    /**
     * 常量池存在于字节码文件中
     * 运行时常量池会加载到运行时常量池中，这是a b ab 都是常量池中的符号，还没有变为java中的字符串对象
     * 只有到运行到某一行代码时，会执行
     * String s1="a"
     * ldc #2 会把a符号变为 a的字符串对象，并且在StringTable字符串常量池中判断其是否有 字符串a，如果没有就存到串池中
     * 字符串常量池底层数据结构是hash表，与布隆过滤器底层实现一样  此时 StringTable=["a"]
     * String s1="b"
     * ldc #3 会把b符号变为”b“的字符串对象，并且在StringTable字符串常量池中判断其是否有字符串b，如果没有就存到串池中
     * String s1="ab"
     * ldc #4 会把ab符号变为”ab“的字符串对象，并且在StringTable字符串常量池中判断其是否有字符串ab，如果没有就存到串池中
     * @param args
     */
    public static void main(String[] args) {
        String s1="a";
        String s2="b";
        String s3="ab";
//        9: new           #5                  // class java/lang/StringBuilder
//       13: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V  调用无参构造
//      17: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//          24: invokevirtual #8                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//              27: astore        4
//      ctrl+N 搜索全局类    StringBuilder的toString方法创建了一个新的String对象存储到堆中
        String s4=s1+s2; //创建了一个StringBuilder对象，编译期间没法确定结果 s1+s2
//        分析 s3是在串池中的对象，s4是在堆中new的一个对象，比较地址吗，两个显然不同
        System.out.println(s3==s4);
//            29: ldc           #4                  // String ab
//        直接在常量池中找到已经拼接好的ab这个常量，这与s3="ab"执行的代码相同，都是在常量池中找ab对象，没有就在串池中创建，有的话直接用
        String s5="a"+"b"; //javac 在编译期间的优化，结果已经在编译期间可以确定为"ab"
        System.out.println(s3==s5);

    }
}
