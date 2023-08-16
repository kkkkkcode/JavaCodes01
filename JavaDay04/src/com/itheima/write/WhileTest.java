package com.itheima.write;

public class WhileTest {
    /*
    初始化语句;
    while(条件判断语句){
        循环体;
        条件控制语句;
    }
     */
    public static void oneToHundred() {
        //需求：利用while循环打印1~100
        //分析：
        //开始条件：1
        //结束条件：100
        int number = 1;
        while (number <= 100) {
            System.out.println(number++);
        }
    }
    public static int paperEqualsHimalaya() {
        /*需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/
        double thickness = 0.1;
        double height = 8844430;
        int count = 0;
        while (thickness < height) {
            count++;
            thickness *= 2;
        }
        return count;
    }
    public static boolean isPalindrome(Integer number) {
        String name = number.toString();
        //1.寻找中心
        for (int i = 0; i < name.length(); i++) {
            String cons = searchAround(i, i, name);
            if (cons == name) return true;
        }
        return false;
    }
    public static String searchAround(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            System.out.println(s.charAt(left));
            System.out.println(s.charAt(right));
            left--;
            right++;
            /*
            由于三个判断条件使用短路与相连，
            所以当left==-1时，不会触发s.charAt(left)中的索引超出范围报错，
            直接在第一个条件判断语句left >= 0中，判定为false，
            而结束while循环
            */
            System.out.println(left);
            System.out.println(right);
            /*
            在最后一次循环中，right已经超过了索引，达到了s.length()，
            但是由于返回值中substring(int beginIndex, int endIndex)函数的形参中，
            beginIndex参数表示子串的起始位置（包括），它是一个索引值，从0开始计数。如果beginIndex为负数，则表示从字符串末尾开始计数，例如，-1表示倒数第一个字符。
            endIndex参数表示子串的结束位置（不包括），它也是一个索引值。如果endIndex为负数，则表示从字符串末尾开始计数。如果endIndex大于字符串的长度，则会截取到字符串的末尾。
            所以，如果使用System.out.println(s.charAt(right));会报错，但是程序本身正确
            */
        }
        return s.substring(left + 1, right);
    }
    public static boolean isPalindromeAlter(int x) {
         /*需求：给你一个整数 x 。
        如果 x 是一个回文整数，打印 true ，否则，返回 false 。
        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121 是回文，而 123 不是。*/
//        //1.定义数字
//        //2.获取个位
//        int ge = x%10;
//        //获取十位
//        int shi=x/10%10;
//        int result = ge*10+shi;
//        System.out.println(result);
        //1.定义数字
        //2.利用循环开始从右往左获取每一位数字
        final int compareNum = x;
        int num = 0;
        while (x != 0) {
            //从右往左获取每一位数字
            int ge = x % 10;
            x /= 10;
            num = num * 10 + ge;
            //System.out.println(x);
        }
        return num == compareNum;
    }
    public static void divideAndMod(int num1, int num2) {
        /*需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围） 。
        将两数相除，要求不使用乘法、除法和 % 运算符。
        得到商和余数。
         */
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count);//商
        System.out.println(num1);//余数
    }
    public static void main(String[] args) {
        divideAndMod(3, 8);
    }
}
