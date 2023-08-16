package com.itheima.write;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        System.out.println(threeAndFive());
    }

    public static void oneFive() {
        //需求1：打印1~5
        //分析
        //开始条件：1
        //结束条件：5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //需求2：打印5~1
        //分析
        //开始条件：5
        //结束条件：1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void reloadLink() {
        /* 在实际开发中，需要重复执行的代码，会选择循环实现。
        比如：如左图所示。玩游戏的时候，如果网不好那么会经常断线重连。
        那么断线重连这个业务逻辑就需要重复执行。
        假设现在公司要求，断线重连的业务逻辑最多只写5次。
        请用代码实现。
        备注：断线重连的业务逻辑可以用输出语句替代。*/
        //分析：
        //1，因为我们需要重复执行某段代码，所以需要用循环解决
        //循环的次数 5 次
        //开始条件：1
        //结束条件：5
        boolean linkStatus = false;
        for (int i = 1; i <= 5; i++) {
            System.out.println("断线重连中第" + i + "次");
            //断线重连Spring语句
            //......
            if (linkStatus) {
                System.out.println("断线重连成功");
                break;
            }

        }
    }

    public static int sumToNumber(int number) {
        //扩展小点：
        //1.求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
        //2.如果我们把变量定义在循环的里面，那么当前变量只能在本次循环中有效。
        //当本次循环结束之后，变量就会从内存中消失。
        //第二次循环开始的时候，又会重新定义一个新的变量。
        //结论：如果以后我们要写累加求和的变量。可以把变量定义在循环的外面。

        //累加思想
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            //如果把sum定义在for循环里，那么它只能在循环大括号里有效
            sum += i;
        }
        return sum;
    }

    public static int sumEvenNumber(int number) {
        //分析：
        //1.获取1 ~100之间的每个数
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            //2.累加求和（先判断，再求和）
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int threeAndFive() {
        /* 需求：键盘录入两个数字，表示一个范围。
        统计这个范围中。
        既能被3整除，又能被5整除数字有多少个？*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        int count = 0;
        for (int i = Math.min(number1, number2); i <= Math.max(number1, number2); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
