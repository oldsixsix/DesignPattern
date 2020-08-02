package com.doublestrong.DesignPattern.simpleFactory;

/**
 * @author Double strong
 * @date 2020/6/6 8:46
 * 客户端测试
 */
public class clientTest {
    public static void main(String[] args) throws Exception {
      //测试简单工厂模式，将参数传给工厂
        double num1=11;
        double num2=10.0;
        String operation="*";
        //把参数传给简单工厂，工厂内部根据逻辑创建产品，客户不需要了解产品的建造过程，只需要知道参数
        Operation oper = SimpleFactory.createOperation(operation);
        double result = oper.getResult(num1, num2);
        System.out.println(result);
    }
}
