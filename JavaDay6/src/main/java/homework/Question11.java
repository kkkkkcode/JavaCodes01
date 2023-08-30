package homework;

import java.util.Random;

public class Question11 {
    //在综合练习中，此题在第7个视频讲解
    public static void main(String[] args) {
        int[] bonus = {2, 588, 888, 1000, 10000};
        lottery(bonus);
    }

    public static void lottery(int[] bonus) {
        Random rd = new Random();
        //核心思路：定义一个新数组，记录哪些奖已经被抽出，如果这个记录数组已满，则退出进程
        int[] brr = new int[bonus.length];
        int index = 0;
        while (index < bonus.length) {
            int rdIndex = rd.nextInt(bonus.length);
            if (!existInArray(brr, bonus[rdIndex])) {
                System.out.println(bonus[rdIndex] + "元的奖金被抽出");
                brr[index] = bonus[rdIndex];
                index++;
            }
        }
    }

    public static boolean existInArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }
}
