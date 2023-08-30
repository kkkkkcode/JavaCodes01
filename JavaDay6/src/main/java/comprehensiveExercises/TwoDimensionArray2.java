package comprehensiveExercises;

import Jama.Matrix;

import java.util.ArrayList;

public class TwoDimensionArray2 {
    public static void main(String[] args) {
        //二维数组的动态初始化
        //数据类型[][] 数组名 = new 数据类型[m][n];
        //m表示这个二维数组，可以存放多少个一维数组
        //n表示这个一维数组，可以存放多少元素

        //int[][] arr = new int[2][3];
        //该数组可以存放2个一维数组，每个一维数组中可以存放3个int数据类型

        int[][] arr = new int[3][5];

        //给二维数组赋值一个元素
        arr[0][0] = 10;

        //遍历二维数组
        //外循环：遍历二维数组获取里面每一个一维数组
        //内循环：遍历一维数组获取每一个元素

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //特殊情况一
        //表示在堆内存当中，只创建了一个二维数组，没有创建一维数组
        int[][] arr1 = new int[2][];
        //此时需要在左边的代码当中，手动创建一维数组
        int[] arr11 = {11,22};
        int[] arr12 = {44,55,66};
        arr1[0] = arr11;
        arr1[1] = arr12;


        //特殊情况二
        int[][] arr2 = new int[2][];
        int[] arr21 = {11,22};
        int[] arr22 = {44,55,66};
        arr2[0] = arr11;
        arr2[1] = arr12;
        //此时，原来的0x0022和0x0033就会被覆盖掉，变成垃圾，从内存中消失



    }
}
