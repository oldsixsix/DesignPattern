package com.doublestrong.DesignPattern.adapterPattern.classAdapter;

/**
 * @author Double strong
 * @date 2020/3/11 10:10
 * 输出220v的电压
 */
public class Voltage220V {
    public int output220v(){
        int v=220;
        System.out.println("电压是"+v+"V");
        return v;
    }
}
