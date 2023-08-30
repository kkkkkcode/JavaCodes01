package homework;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        System.out.println(number + "是" + method2(number) + "位数字");
    }

    public static int method(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static int method2(int number) {
        int count = 0;
        for (int i = 0; number / (int) Math.pow(10, i) != 0; i++) {
            count++;
        }
        return count;
    }
}
