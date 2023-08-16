package com.itheima.write;

public class SwitchDemo1 {
    /*
    switch (表达式) {
    case 1:
        语句体1;
        break;
    case 2:
        语句体2;
        break;
    ...
    default:
        语句体n+1;
        break;
    }
    执行流程：
    - 首先计算出表达式的值（注意，这里表达式不是判断，而是会得到一个具体的结果）
    - 其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束整个的switch语句。
    - 最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。
    - switch语句和if语句的第三种格式相似

    格式说明：
    1. 表达式：（将要匹配的值）取值为 byte、short、int、char。JDK5以后可以是枚举，JDK7以后是可以是String。
    2. case：后面跟的是要和表达式进行比较的值（被匹配的值）
    3. break：表示中断，结束的意思，用来结束switch语句
    4. default：表示所有情况都不匹配的时候，就执行该处的内容，和if语句中的else相似
    5. case后面的值只能是字面量，不能是变量（注意）
    6. case给出的值不允许重复
     */

    public static void main(String[] args) {
        //兰州拉面、武汉热干面、北京炸酱面、陕西油泼面
        //1.定义变量记录我心中想吃的面
        String noodles = "兰州拉面";
        //2.拿着这个面利用switch跟四种面条匹配
        switch (noodles) {
            //switch新特性
            case "兰州拉面" -> System.out.println("吃兰州拉面");
            case "武汉热干面" -> System.out.println("吃武汉热干面");
            case "北京炸酱面" -> System.out.println("吃北京炸酱面");
            case "陕西油泼面" -> System.out.println("吃陕西油泼面");
            default -> System.out.println("吃方便面");
        }
    }
}
