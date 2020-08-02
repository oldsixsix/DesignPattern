package com.doublestrong.DesignPattern.adapterPattern.classAdapter;

/**
 * @author Double strong
 * @date 2020/3/11 10:18
 * 手机类相当于客户端，调用5v的接口
 */
public class Phone {
//    手机充电用的是5v电压
    public void charging(Voltage5V voltage5V){
//      判断调用接口的电压是否为5v
        if(voltage5V.output5V()==5)
        {
            System.out.println("电压是5v,可以充电");
        }
        else if(voltage5V.output5V()>5)
        {
            System.out.println("电压大于5v无法充电");
        }
    }
}
