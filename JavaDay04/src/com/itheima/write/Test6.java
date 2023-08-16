package com.itheima.write;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        if语句的第三种格式
        在实际开发中，如果是多情况判断，会使用到if的第三种格式
        格式：
        if (关系表达式1) {
            语句体1;
        } else if (关系表达式2) {
            语句体2;
        }
        …
        else {
            语句体n+1;
        }
        执行流程：
        ①首先计算关系表达式1的值
        ②如果值为true就执行语句体1；如果值为false就计算关系表达式2的值
        ③如果值为true就执行语句体2；如果值为false就计算关系表达式3的值
        ④…
        ⑤如果没有任何关系表达式为true，就执行语句体n+1。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，表示小明的成绩");
        int score = sc.nextInt();

        //对异常数据进行校验
        //0～100合理数据
        if (score > 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车一辆");
            } else if (score >= 90 && score < 95) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score < 90) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        } else {
            System.out.println("当前录入的成绩不合法");
        }
    }
}

