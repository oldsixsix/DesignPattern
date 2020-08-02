package com.doublestrong.JVM.test.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
     * 售票窗口
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class ticketWindow{
//        余票数量
        private int count;

//        售票
        public synchronized   int sell(int amount){
            if(this.count>=amount)
            {
//                余票数大于卖票数
                this.count-=amount;
//                返回购买成功票数
                return amount;
            }
            else {
                return 0;
            }
        }
    }