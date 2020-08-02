package com.doublestrong.JVM;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Double strong
 * @date 2020/6/29 17:46
 */
public class Demo4 {
    public static void main(String[] args) {
//        证明StringTable存在的位置
//        1.设置堆的内存大小 -Xmx10m
//        -XX:UseGCOverheadLimit : 如果98%的时间花在垃圾回收上，但是2%的堆空间被回收了，就会爆出
//        -XX:-UseGCOverheadLimit 关闭这个开关就会看到堆内存溢出
//        2.java.lang.OutOfMemoryError: Java heap space
//        不断添加String字符串到常量池中，并且还存在其引用，垃圾回收没办法回收，
//        这时候堆内存溢出即证明，字符串常量池在堆内存中
        List<String> list=new ArrayList<>();
        int i=0;
        try {
            for (int j=0;j<26000000;j++)
            {
//                把j转换成字符串对象，intern就是把字符串对象存入字符串常量池中
                list.add(String.valueOf(j).intern());
                i++;
            }
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println(i);
        }
    }
}
