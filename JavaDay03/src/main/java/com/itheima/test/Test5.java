package com.itheima.test;

public class Test5 {
    /*
    需求：一座寺庙里住着三个和尚，已知他们的身高分别为150cm，210cm，165cm，请用程序实现获取这三个和尚的最高身高
     */

    public static void main(String[] args) {
        int number1 = 150;
        int number2 = 210;
        int number3 = 165;
        int tempMax = number1 > number2 ? number1 : number2;
        int finalMax = tempMax > number3 ? tempMax : number3;
        System.out.println(finalMax);
    }
}
