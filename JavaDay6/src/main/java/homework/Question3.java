package homework;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        method(num1, num2, num3);
    }

    //自己想的方法不对，不能单纯的只使用三目运算符，容易造成严重错误
    public static void method(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        if (num1 > num2) {
            //在这里：max代表num1和num3之间的较大值，因为如果num1大于num3，因为它已经大于num2，所以一定是最大。
            //如果num3大于num1，因为num1已经大于num2，所以num3就是最大
            int max = num1 > num3 ? num1 : num3;
            //在这里：min代表num2和num3之间的较小值，因为如果num2小于num3，因为它已经小于num1，所以一定是最小。
            //如果num3小于num2，因为num2已经小于num1，所以num3就是最小
            int min = num2 < num3 ? num2 : num3;
            int mid = sum - max - min;
            System.out.println(max);
            System.out.println(mid);
            System.out.println(min);
        } else {
            int max = num2 > num3 ? num2 : num3;
            int min = num1 < num3 ? num1 : num3;
            int mid = sum - max - min;
            System.out.println(max);
            System.out.println(mid);
            System.out.println(min);
        }

    }
}
