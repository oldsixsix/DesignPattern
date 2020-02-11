package com.DoubleStrong.StrategyPattern;

/**
 * @author Double strong
 * @date 2020/2/11 21:17
 */
public class OriginalPrice implements Strategy {
    @Override
    public double getRealPrice(double OriginalPrice) {
        return OriginalPrice;
    }
}
