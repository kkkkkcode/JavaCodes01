package comprehensiveExercises;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原始密码");
        int number = sc.nextInt();
        int[] arr = toArray(number);
        int[] newArr = dealWithArray(arr);
        int password = getPassword(newArr);
        System.out.println(password);
        System.out.println(decode(password));
    }

    private static int getPassword(int[] newArr) {
        int password = 0;
        for (int j : newArr) {
            password = password * 10 + j;
        }
        return password;
    }

    //把整数每一位都添加到数组当中
    //大于0的整数
    //反向推导
    /*计算出数组长度
    需要有一个数组
    动态初始化
    把整数每一位都添加到数组当中*/
    public static int[] toArray(int num) {
        int count = 0;
        //在第一次循环中，num已经变成了0，需要复制一个num的初始值，赋值给新变量copyNum
        int copyNum = num;
        while (num != 0) {
            num /= 10;
            count++;
        }
        int[] array = new int[count];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = copyNum % 10;
            copyNum /= 10;
        }
        return array;
    }

    public static int[] dealWithArray(int[] array) {
        //int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;
            array[i] %= 10;
            //newArr[array.length - (i + 1)] = array[i];
        }
        arrayReverse(array);
        return array;
    }

    //也可以使用二分的思想进行数组反转
    public static int[] arrayReverse(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            array[i] = array[i] ^ array[j];
            array[j] = array[i] ^ array[j];
            array[i] = array[i] ^ array[j];
            i++;
            j--;
        }
        return array;
    }

    //另一种写法：
    public static int[] arrayReverse1(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            array[i] = array[i] ^ array[j];
            array[j] = array[i] ^ array[j];
            array[i] = array[i] ^ array[j];
        }
        return array;
    }

    public static int decode(int password) {
        int[] passwordArray = toArray(password);
        int[] numArray = arrayReverse(passwordArray);
        //对10取余的反运算怎么求？？
        //由于加密是通过对10取余的方式进行获取，解密时需要对每一位数进行判断，0~4之间，+10,   5~9之间，不动

        for (int i = 0; i < numArray.length; i++) {
            /*
            if(numArray[i] >= 0 && numArray[i] <= 4){
                numArray[i] += 10;
            }
            numArray[i] -= 5;
             */
            numArray[i] += 10;
            while (numArray[i] - 5 >= 10) {
                numArray[i] -= 10;
            }
            numArray[i] -= 5;
        }
        return getPassword(numArray);
    }
}