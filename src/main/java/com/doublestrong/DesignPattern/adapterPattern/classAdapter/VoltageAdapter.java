package com.doublestrong.DesignPattern.adapterPattern.classAdapter;

/**
 * @author Double strong
 * @date 2020/3/11 10:15
 * 适配器类。继承220v实现5v接口
 * 采用的是继承的方法，是类适配器模式
 *
 *
 */
public class VoltageAdapter extends Voltage220V  implements Voltage5V {

    @Override
    public int output220v() {
        return super.output220v();
    }

    @Override
    public int output5V() {
//     要获取到220v的电压,继承了被适配的类，即可调用其方法
    int V=output220v();
//    在适配器中转换做适配
    int TargetV=V/44;
        return TargetV;
    }
}
