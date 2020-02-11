package com.DoubleStrong.StrategyPattern;

/**
 * @author Double strong
 * @date 2020/2/11 21:20
 * 打8折算法
 */
public class Discount implements Strategy{
    @Override
    public double getRealPrice(double OriginalPrice) {
        return OriginalPrice*0.8;
    }
}
