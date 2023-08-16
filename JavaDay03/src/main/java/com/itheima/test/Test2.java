package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦程度");
        int myFashion = sc.nextInt();
        System.out.println("请输入你对象的时髦程度");
        int girlFashion = sc.nextInt();
        boolean compare = myFashion > girlFashion;
        System.out.println(compare);
    }

}
