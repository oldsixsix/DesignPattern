package com.doublestrong.DesignPattern.strategyPattern;

/**
 * @author Double strong
 * @date 2020/2/11 21:26
 * 策略上下文 持有一个具体的策略实例，在其方法内部调用具体策略的具体实现
 */
public class StrategyContext {
//    持有一个策略实现的引用
    private Strategy strategy=null;
//将策略模式与简单工厂模式相结合，
//    简单工厂模式实现将switch case接收不同参数返回不同实例的功能，将客户端判断逻辑转移到工厂
//    type为商场选择的打折策略
    public StrategyContext(String type) {
        switch (type)
        {
            case "原价":Strategy s1=new OriginalPrice();
                strategy=s1;
            break;
            case "8折": Strategy s2=new Discount();
                strategy=s2;
                break;
            case "满减":Strategy s3=new FullReduction();
                strategy=s3;
                break;
        }

    }

    public double getResult(double originalPrice){
        double realPrice = strategy.getRealPrice(originalPrice);
        return  realPrice;
    }
}
