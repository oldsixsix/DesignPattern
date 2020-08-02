package com.doublestrong.DesignPattern.strategyPattern;

/**
 * @author Double strong
 * @date 2020/2/11 21:20
 * 满300减30算法
 */
public class FullReduction implements Strategy {
    @Override
    public double getRealPrice(double OriginalPrice) {
        if(OriginalPrice>300)
           OriginalPrice-=30;
        return OriginalPrice;
    }
}
