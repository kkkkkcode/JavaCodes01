package com.itheima;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class homework {
    public static List<Double> question1(double hDad, double hMum) {
        double hSon = (hDad + hMum) * 1.08 / 2;
        double hDaughter = (hDad * 0.923 + hMum) / 2;
        List<Double> answer = Arrays.asList(hSon, hDaughter);
        return answer;
    }

    public static boolean question2() {
        int m1 = 21 * 2 + 3;
        int m2 = 24 * 2;
        boolean result = m1 == m2;
        return result;
    }

    public static double question3() {
        double way1 = (24 + 8 + 3) >= 30 ? (24 + 8 + 3) * 0.8 : 24 + 8 + 3;
        int way2 = 16 + 8 + 3;
        return way1 < way2 ? way1 : way2;
    }

    public static boolean question6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        boolean judge = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        return judge;
    }

    public static int question7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入这个整数");
        int number = sc.nextInt();
        int[] sav = new int[3];
        int result = 0;
        for (int i = 0; i <= 2; i++) {
            //取第n位数：number / (int) Math.pow(10, n - 1) % 10
            sav[i] = number / (int) Math.pow(10, i) % 10;
            result = result + sav[i];
        }
        System.out.println(sav[0]);
        System.out.println(sav[1]);
        System.out.println(sav[2]);
        return result;
    }
    public static void main(String[] args) {
        List<Double> answer = question1(177, 165);
        answer.forEach(System.out::println);
        System.out.println(question2());
        System.out.println(question3());
        System.out.println(question6());
        System.out.println(question7());
    }
}
