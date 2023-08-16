package com.itheima.Logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        /*
        1.&&
        运行结果跟单个&是一样的
        表示两边都是真，结果才是真
         */
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(false && true);//false
        System.out.println(true && false);//false
        /*
        2.||
        运行结果跟单个|是一样的
        表示两边都是假，结果才是假
         */
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println(true || false);//true
        /*
        3.短路逻辑运算符具有短路效果
        简单理解：当左边的表达式能确定最终结果，右边就不会参与运行了
         */
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10
        //主要看b，如果b是10，那么先++（先加后用）没有执行
        /*
        & | 无论左边true false，右边都要执行
        && || 如果左边能确定整个表达式的结果，右边不执行
        &&:左边为false，右边不管是真是假，整个表达式的结果一定是false
        ||:左边为true，右边不管是真是假，整个表达式的结果一定是true
        这两种情况下，右边不执行，提高了效率
         */
    }
}
