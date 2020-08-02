package com.doublestrong.JUC.Demo;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.CharBuffer;

/**
 * @author Double strong
 * @date 2020/7/3 14:02
 */
@Slf4j
public class Sync {
    public static void main(String[] args) throws FileNotFoundException {
//        FileReader.read
//        同步就是顺序执行
//        FileInputStream fileInputStream = new FileInputStream("D:\\develop\\IDEA_Project\\DesignPattern\\src\\main\\java\\com\\doublestrong\\JUC\\notes.md");// 内容是：abc
//        System.out.println(fileInputStream);
//        log.debug("do other things");
//        异步执行,不需要等待结果返回，直接执行到下面了
        new Thread(() ->
        {
            try {
                FileInputStream fileInputStream = new FileInputStream("D:\\develop\\IDEA_Project\\DesignPattern\\src\\main\\java\\com\\doublestrong\\JUC\\notes.md");
                System.out.println(fileInputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        );

        log.debug("do other things");
    }
}
