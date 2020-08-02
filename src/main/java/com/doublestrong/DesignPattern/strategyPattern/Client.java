package com.doublestrong.DesignPattern.strategyPattern;

/**
 * @author Double strong
 * @date 2020/6/6 9:10
 */
public class Client {
    public static void main(String[] args) {
//        这里是将策略模式与工厂模式相结合，只需要传入创建策略的具体参数，由strategyContext策略上下文内部根据逻辑判断创建具体策略
//       单纯就策略模式来说，应该是传入具体的策略对象，对策略上下文进行初始化
        StrategyContext strategyContext = new StrategyContext("8折");
        double result = strategyContext.getResult(100.00);
        System.out.println(result);
    }
}
