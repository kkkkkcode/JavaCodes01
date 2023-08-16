package com.itheima;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class homework {
    public static void ifQuestion1() {
        double notRenew = 7988 - 1500;
        double renew = 7988 * 0.8;
        if (renew < notRenew) {
            System.out.println("可以以旧换新");
        } else if (renew == notRenew) {
            System.out.println("二者一样省钱");
        } else {
            System.out.println("不要以旧换新");
        }
    }

    public static int ifQuestion2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        int temp = num1 < num2 ? num1 : num2;
        int temp2 = temp < num3 ? temp : num3;
        return temp2;
    }

    public static int ifQuestion21() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        if (num1 <= num2) {
            if (num1 <= num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 <= num3) {
                return num2;
            } else {
                return num3;
            }
        }
        /*
        //if嵌套思路
        //定义变量代表最小值
        int min;
        //对三个整数进行判断
        if( i < j && i < k){
            min = i;
        }else if( j < i && j < k){
            min = j;
        }else{
            min = k;
        }
         */
    }

    public static void ifQuestion3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入金额");
        int money = sc.nextInt();
        System.out.println("请输入存款年限，可选：1，2，3，5");
        int year = sc.nextInt();
        if (money >= 1000) {
            if (year == 1) {
                double sum = money + money * 0.0225 * 1;
                System.out.println(sum);
            } else if (year == 2) {
                double sum = money + money * 0.027 * 2;
                System.out.println(sum);
            } else if (year == 3) {
                double sum = money + money * 0.0325 * 3;
                System.out.println(sum);
            } else if (year == 5) {
                double sum = money + money * 0.036 * 5;
                System.out.println(sum);
            } else {
                System.out.println("年限不对");
            }
        } else {
            System.out.println("存钱不够1000");
        }
    }

    public static void ifQuestion4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类别（0表示普通顾客，1表示会员）");
        int consumerSort = sc.nextInt();
        System.out.println("请输入购物折前金额");
        int oriMoney = sc.nextInt();
        if (consumerSort == 0) {
            if (oriMoney < 100 && oriMoney >= 0) {
                double spend = oriMoney;
                System.out.println(spend);
            } else if (oriMoney >= 100) {
                double spend = oriMoney * 0.9;
                System.out.println(spend);
            } else {
                System.out.println("不是有效的折前金额");
            }
        } else if (consumerSort == 1) {
            if (oriMoney < 200 && oriMoney >= 0) {
                double spend = oriMoney * 0.8;
                System.out.println(spend);
            } else if (oriMoney >= 200) {
                double spend = oriMoney * 0.75;
                System.out.println(spend);
            } else {
                System.out.println("不是有效的折前金额");
            }
        } else {
            System.out.println("不是有效的顾客类型");
        }
    }

    public static double ifQuestion5(int wageBeforeTax) {
        double[] fullTax = DoubleStream.of(3000 * 0.03,9000 * 0.1,13000 * 0.2,
                10000 * 0.25,20000 * 0.3,25000 * 0.35).toArray();
        if (wageBeforeTax * 0.9 <= 5000) return wageBeforeTax;
        else if (wageBeforeTax * 0.9 > 5000) {
            int tax = 0;
            double taxPart = wageBeforeTax * 0.9 - 5000;
            if (taxPart <= 3000 && taxPart >= 0) {
                tax += taxPart * 0.03;
            } else if (taxPart > 3000 && taxPart <= 12000) {
                tax += Arrays.stream(fullTax).limit(1).sum() + (taxPart - 3000) * 0.1;
            } else if (taxPart > 12000 && taxPart <= 25000) {
                tax += Arrays.stream(fullTax).limit(2).sum() + (taxPart - 12000) * 0.2;
            } else if (taxPart > 25000 && taxPart <= 35000) {
                tax += Arrays.stream(fullTax).limit(3).sum() + (taxPart - 25000) * 0.25;
            } else if (taxPart > 35000 && taxPart <= 55000) {
                tax += Arrays.stream(fullTax).limit(4).sum() + (taxPart - 35000) * 0.3;
            } else if (taxPart > 55000 && taxPart <= 80000) {
                tax += Arrays.stream(fullTax).limit(5).sum() + (taxPart - 55000) * 0.35;
            } else if (taxPart > 80000) {
                tax += Arrays.stream(fullTax).sum() + (taxPart - 80000) * 0.45;
            } else {
                return 0;
            }
            return wageBeforeTax * 0.9 - tax;
        } else {
            return 0;
        }
    }

    public static double switchQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)");
        int command = sc.nextInt();
        switch (command) {
            case 1 -> {
                return num1 + num2;
            }
            case 2 -> {
                return num1 - num2;
            }
            case 3 -> {
                return num1 * num2;
            }
            case 4 -> {
                return (double) num1 / (double) num2;
            }
            default -> {
                System.out.println("Invalid Calculative command!");
                return 0;
            }
        }

    }

    public static int loopQuestion1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        int begin = number1 < number2 ? number1 : number2;
        int end = number1 > number2 ? number1 : number2;
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static int loopQuestion2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        int begin = number1 < number2 ? number1 : number2;
        int end = number1 > number2 ? number1 : number2;
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int loopQuestion3() {
        double height = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper <= height) {
            paper *= 2;
            count++;
        }
        return count;
    }

    public static boolean loopQuestion4(int number) {
        final int compare = number;
        int ge;
        int sum = 0;
        while (number != 0) {
            //取出个位
            ge = number % 10;
            //求和（上一次的个位）乘以10+这一次的个位，实现了把一个数倒过来的核心步骤之一
            sum = sum * 10 + ge;
            //把原来的数除以10
            number /= 10;
        }
        return compare == sum;
    }

    public static void loopQuestion5(int dividend, int divisor) {
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        System.out.println(count);
        System.out.println(dividend);
    }

    public static void loopQuestion6() {
        int i = 2019;
        while (i >= 1949) {
            if ((2019 - i) % 12 == 0) System.out.println(i);
            i--;
        }
    }

    public static void loopQuestion7() {
        int i = 1988;
        while (i <= 2019) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(ifQuestion5(15000));
    }
}
