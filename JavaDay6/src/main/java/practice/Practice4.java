package practice;

import Jama.Matrix;

public class Practice4 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 9, 7, 3, 5, 1, 6, 3};
        int[] newArr = copyOfRange(arr, 4, 6);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        if (from >= to) {
            System.out.println("开始索引不能大于等于终止索引");
            return null;
        } else {
            if (to > arr.length) {
                System.out.println("终止索引不能超过数组范围");
                return null;
            } else {
                //也可以伪造索引
                //int index = 0;
                for (int i = from; i < to; i++) {
                    newArr[i - from] = arr[i];
                    //newArr[index] = arr[i];
                    //index++;
                }
                return newArr;
            }
        }
    }
}
