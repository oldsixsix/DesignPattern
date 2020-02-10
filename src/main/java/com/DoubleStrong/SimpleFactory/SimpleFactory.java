package com.DoubleStrong.SimpleFactory;

/**
 * @author Double strong
 * @date 2020/2/10 21:47
 *
 * 简单工厂模式将对象的创建转移到了工厂中，用户不用关心对象的实例化过程
 */
public class SimpleFactory {
//    简单工厂模式中用静态方法创建具体事例 用到了父类子类的关系
    public static Operation createOperation(String operation){
// 1.7以后jdkswitch支持string
        Operation oper=null;
        switch (operation)
        {
            case "+": oper=new add();
            break;
            case "-": oper=new sub();
                break;
            case "*": oper=new mul();
                break;
            case "/": oper=new div();
                break;
        }
        return oper;
    }

}
