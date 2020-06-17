package com.doublestrong.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author Double strong
 * @date 2020/6/15 10:57
 */
public class Client {
    public static void main(String[] args) {
//        通过反射在运行时获取了的所有变量信息
        Class<SonClass> mClass = SonClass.class;
        System.out.println("类的名称：" + mClass.getName());
        //2.1 获取所有 public 访问权限的变量
        // 包括本类声明的和从父类继承的  public的变量
//        Field[] fields = mClass.getFields();
//         输出 SonClass 类的所有成员变量，不问访问权限
        Field[] fields = mClass.getDeclaredFields();
        for (Field field : fields) {
//            获取变量的访问权限
            int modifiers = field.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            System.out.println(field.getType().getName()
                    + " " + field.getName());
        }

//        2. 获取类的所有方法信息
        Method[] methods = mClass.getMethods();
        for (Method method : methods) {
//            获取并输出方法的访问权限
            int modifiers = method.getModifiers();
            System.out.println(Modifier.toString(modifiers)+" ");
//            获取并输出方法的返回值类型
            Class<?> returnType = method.getReturnType();
            System.out.println(returnType.getName());

//            获取并输出方法的所有参数
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType().getName()+"---"+parameter.getName());
            }
        }



    }
}
