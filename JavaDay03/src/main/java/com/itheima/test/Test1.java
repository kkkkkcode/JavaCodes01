package com.itheima.test;

import java.util.Scanner;

public class Test1 {

    static class CalculationResult {
        public int hundredDigit;
        public int tensDigit;
        public int unitsDigit;
    }

    public static CalculationResult numberBreak(int number) {
        CalculationResult result = new CalculationResult();
        result.hundredDigit = number / 100 % 10;
        result.tensDigit = number / 10 % 10;
        result.unitsDigit = number % 10;
        //公式推导：
        //取第n位数：number/(int)Math.pow(10,n-1)%10
        return result;

    }

    public static void main(String[] args) {
        //键盘录入一个三位数，获取其中的个位，十位，百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        CalculationResult result = numberBreak(number);
        System.out.println("个位是：" + result.unitsDigit);
        System.out.println("十位是：" + result.tensDigit);
        System.out.println("百位是：" + result.hundredDigit);
    }

}
