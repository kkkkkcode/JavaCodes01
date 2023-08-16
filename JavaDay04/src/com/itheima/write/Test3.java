package com.itheima.write;

import java.util.Scanner;

public class Test3 {
    /*
    if语句的第二种格式
    if (关系表达式){
        语句体1;
    }else{
        语句体2;
    }
    执行流程：
    1.首先计算关系表达式的值
    2.如果关系表达式的值为true就执行语句体1
    3.如果关系表达式的值为false就执行语句体2
    4.继续执行后面的其他语句
    注意：如果执行了语句体1，就不会执行语句体2，此时整个if语句体结束，反之亦然
     */
    public static void main(String[] args) {
        /*需求：键盘录入一个整数，表示身上的钱。
        如果大于等于100块，就是网红餐厅。
        否则，就吃经济实惠的沙县小吃。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入身上带了多少钱");
        int money = sc.nextInt();
        if(money>100) {
            System.out.println("网红餐厅");
        } else{
            System.out.println("沙县小吃");
        }
    }

}
