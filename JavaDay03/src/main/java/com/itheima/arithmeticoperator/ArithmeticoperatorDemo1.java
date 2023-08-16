package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3+2);
        //-
        System.out.println(5-1);
        //*
        System.out.println(7*9);

        //在代码中，如果有小数参与计算，结果有可能是不精确的
        //为什么呢
        //暂时只要知道这个结论就可以了
        //具体的原因，我们到了JavaSE时，会在详细地讲解
        System.out.println(1.1+1.1);
        System.out.println(1.1+1.01);
        System.out.println(1.1-1.01);
        System.out.println(1.1*1.01);

        System.out.println();

    }
}
