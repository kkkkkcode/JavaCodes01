package comprehensiveExercises;

import java.util.Random;

public class AuthCode1 {
    //另一个方法：
    //在以后如果我们要在一堆没有什么规律的数据中随机抽取
    //可以先把这些数据放到数组当中
    //再随机抽取一个索引
    public static void main(String[] args) {
        //分析：
        //1.大写字母和小写字母都放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //添加大写字母
                chs[i] = (char) (65 + i);
            } else {
                //添加小写字母
                chs[i] = (char) (97 + i - 26);
            }
        }
        //定义一个字符串类型的变量，用来记录最终的结果
        String result = new String();
        //2.随机抽取4次
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int rdIndex = rd.nextInt(chs.length);
            //System.out.print(chs[rdIndex]);
            result += chs[rdIndex];
        }
        //3.随机抽取一个数字0~9
        int number = rd.nextInt(10);
        //System.out.print(number);
        result += number;
        System.out.println(result);
    }
}
