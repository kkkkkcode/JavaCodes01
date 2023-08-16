package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    /*
    数字6是一个真正伟大的数字，键盘录入两个整数
    如果其中一个为6，最终输出结果为true
    如果他们的和为6的倍数，最终输出结果为true
    其他情况都是false
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int firstInteger = sc.nextInt();
        System.out.println("请输入第二个整数");
        int secondInteger = sc.nextInt();
        boolean judge = firstInteger == 6 || secondInteger == 6 || (firstInteger + secondInteger) % 6 == 0;
        System.out.println(judge);
    }


}
