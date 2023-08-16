package com.itheima.write;
import java.util.Scanner;
public class Test18 {
    /*需求：给你一个整数 x 。
        如果 x 是一个回文整数，打印 true ，否则，返回 false 。
        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121 是回文，而 123 不是。*/
    //核心思路：把这个整数倒过来，比较倒过来之后和原来的整数是否一样
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.获取整数，定义变量
        System.out.println("请输入要判定的整数");
        int number = sc.nextInt();
        boolean judge = isPalindrome(number);
        System.out.println(judge);
    }
    public static boolean isPalindrome(int number) {
        //2.在while循环外定义两个量:一个常量记录number的初值，一个变量用来求将number各位数颠倒之后的和
        final int originalValue = number;
        int sum = 0;
        while (number != 0) {
            //3.获取个位
            int unitDigit = number % 10;
            //4.在求和变量中,先自乘10,再加入当前的个位
            sum = sum * 10 + unitDigit;//这一步很重要，自己写的时候没想出来，将来好好复习，反复复习!!!
            /*
            处刑一下自己写的：
            sum += unitDigit;
            sum *= 10;
            错误在于：这么操作，相当于让这一步比循环中的其他部分快了一步，在最后会得到原来的数倒过来再乘以10！
             */
            //5.将number除以10，这样原来的十位变为了现在的个位
            number /= 10;
        }
        //6.在while循环中，回到第3步继续，由于number不停地除以10，其最终结果会变成0
        //while循环的判定条件为：number != 0;
        return sum == originalValue;
    }
}
 /*
        算法的核心思路：通过在每一次循环中都将number除以10，使得下一次循环中，都能取得number中的再向前一位
        以整数1562举例：
        第一次：
        unitDigit=1562%10=2;
        sum=0*10+2=2;
        number=1562/10=156;
        第二次：
        unitDigit=156%10=6;
        sum=2*10+6=26;
        number=156/10=15;
        第三次：
        unitDigit=15%10=5;
        sum=26*10+5=265;
        number=15/10=1;
        第四次：
        unitDigit=1%10=1;
        sum=265*10+1=2651;(得到了最终结果，成功将数颠倒过来)
        number=1/10=0;
        第五次：number==0，循环结束
*/

