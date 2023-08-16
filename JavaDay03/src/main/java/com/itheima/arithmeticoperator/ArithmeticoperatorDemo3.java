package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void add01() {
        int a = 10;
        double b = 12.3;
        double c = a + b;
        /*
        int a = 10;
        double b = 20;
        ? c = a+b;
        数字类型运算时，数据类型不一样不能运算，需要转成一样的，才能运算
         */
        /*
        隐式转换（自动类型提升）：取值范围小的数值——>取值范围大的数值
        int a = 10;
        double b = a;
        b中的值自动变为10.0
        取值范围：byte<short<int<long<float<double
        取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算
        byte short char 三种类型的数据在进行运算的时候，都会先直接提升为int，然后再进行运算
        强制转换：取值范围大的数值——>取值范围小的数值
        如果把取值范围大的数据，赋值给取值范围小的变量，是不允许直接赋值的，如果一定要这么做就加入强制转换
        格式： 目标数据类型 变量名 = (目标数据类型)被强转的数据
        如数据比较大，强转时可能发生错误
         */
    }

    public static void add02() {
        byte a = 10;
        byte b = 20;
        int c = a + b;
    }

    public static void add03() {
        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte) (b1 + b2);
        System.out.println(result);
    }

    public static void stringAdd() {
        System.out.println(3.7 + "abc");//3.7abc
        System.out.println("abc" + true);//abctrue
        System.out.println('中' + "abc" + true);//中abctrue
        int age = 18;
        System.out.println("我的年龄是" + age + "岁");//我的年龄是18岁
        System.out.println("我的年龄是" + "age" + "岁");//我的年龄是age岁
        System.out.println(1 + 2 + "abc" + 2 + 1);//3abc21
    }

    public static void charAdd() {
        char c = 'a';
        int result = c + 0;
        System.out.println(result);//97
        System.out.println(1 + 'a');//98
        System.out.println('a' + "abc");//"aabc"
    }

    public static void aPlusPlus() {
        int a = 10;
        a++;
        System.out.println(a);//11
        ++a;
        System.out.println(a);//12
        a--;
        System.out.println(a);//11
        --a;
        System.out.println(a);//10
    }

    public static void assigningOperator() {
        //+=
        //规则：将左边和右边进行相加，然后再把结果赋值给左边
        int a = 10;
        int b = 20;
        //把a+b，再把结果赋值给左边的变量a
        a += b;
        //等同于a=(变量a的类型)(a+b);
        System.out.println(a);
        System.out.println(b);

        //细节：
        //+-,-=,*=,/=,%=底层都隐藏了一个强制类型转换
        short s = 1;
        //把左边和右边进行相加，得到结果2，再赋值给左边的变量
        s += 1;
        //等同于s=(short)(s+1);
    }

    public static void main(String[] args) {
        aPlusPlus();
    }
}
