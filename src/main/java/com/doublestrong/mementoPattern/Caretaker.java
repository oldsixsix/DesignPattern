package com.doublestrong.mementoPattern;

import lombok.Data;

/**
 * @author Double strong
 * @date 2020/6/13 13:03
 * 负责人角色类Caretaker能够得到的备忘录对象是以MementoIF为接口的，
 * 由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容。
 */
@Data
public class Caretaker {
    private Memento memento;
}
