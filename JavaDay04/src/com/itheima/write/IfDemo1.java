package com.itheima.write;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        /*
        if语句的第一种格式
        if(关系表达式){
            语句体;
        }
        举例：
        if(酒量>2){
            cout<<"小伙子，不错！"<<endl;
        }
        1.首先计算关系表达式的值
        2.如果关系表达式的值为true就执行语句体
        3.如果关系表达式的值为false就不执行语句体
        4.继续执行后面的其他语句
         */
        //需求：键盘录入女婿酒量，如果大于 2 斤，老丈人给出回应，反之不回应
        //1.键盘录入女婿酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿酒量");
        int wine = sc.nextInt();
        //2.对酒量进行判断
        if (wine > 2) {
            System.out.println("小伙子，不错哟！！");
        }
    }
}
