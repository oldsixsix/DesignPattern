package com.doublestrong.strategyPattern;

/**
 * @author Double strong
 * @date 2020/2/11 21:12
 * 面向过程的方法，不利于维护
 */
public class ProcedureOriented {
    public void quote(double originalPrice, String customType){
        switch (customType)
        {
            case "原价":
                System.out.println("原价打折策略");
                break;
            case "八折":
                System.out.println("八折策略");
                break;
            case "满减":
                System.out.println("满减");
                break;
        }

    }

}
