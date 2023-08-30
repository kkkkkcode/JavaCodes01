package homework;

import java.util.Random;

public class Question111 {
    //在综合练习中，此题在第7个视频讲解
    //可以优化原来的奖池
    //如果是Arraylist，直接抽完一个删一个，可是int[]没有这种方法······
    //所以，我们可以直接把原来的奖池打乱顺序！
    public static void main(String[] args) {
        int[] bonus = {2, 588, 888, 1000, 10000};
        Random rd = new Random();
        for (int i = 0; i < bonus.length; i++) {
            int rdIndex = rd.nextInt(bonus.length - i) + i;
            int temp = bonus[i];
            bonus[i] = bonus[rdIndex];
            bonus[rdIndex] = temp;
        }
        for (int i = 0; i < bonus.length; i++) {
            System.out.println(bonus[i] + "元的奖金被抽出");
        }
    }

}
