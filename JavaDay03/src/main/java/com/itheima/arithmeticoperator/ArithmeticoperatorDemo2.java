package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        //整数参与计算，结果只有整数
        //小数参与计算，结果可能不精确
        //除法
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3

        System.out.println(10.0 / 3);//3.3333333333333335

        //取模（取余）
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1
        /*
        1.可以用取模来判断，A是否能被B整除
        A%B 10%3
        2.可以判断A是否为偶数
        A%2 结果为0，偶数；结果为1，奇数
        3.在以后，斗地主发牌
        三个玩家
        把每一张牌定义一个序号，拿着序号%3，结果为1发给第1个玩家，结果为2发给第2个玩家，结果为0发给第3个玩家
         */

    }
}
