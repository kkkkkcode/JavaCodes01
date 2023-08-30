package comprehensiveExercises;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Random rd = new Random();
        //获取红球中奖号码
        int[] redBall = getRedBall(rd);

        System.out.println();

        //获取蓝球中奖号码
        int blueBall = rd.nextInt(16) + 1;
        System.out.println(blueBall);

        //输入红球和蓝球的抽奖号码
        int[] draw = new int[redBall.length];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < draw.length; ) {
            System.out.println("请输入彩票上的第" + (i + 1) + "个红球号码");
            draw[i] = sc.nextInt();
            if (draw[i] >= 1 && draw[i] <= 33) {
                i++;
            } else {
                System.out.println("号码无效，请重新输入彩票上的第" + (i + 1) + "个红球号码");
            }
        }
        System.out.println("请输入彩票上的蓝球号码");
        int drawBlue = sc.nextInt();
        if (!(drawBlue >= 1 && drawBlue <= 16)) {
            System.out.println("号码无效，请重新输入彩票上的蓝球号码");
            drawBlue = sc.nextInt();
        }

        //判定红球中了几个
        //中奖号码放在了int[] redBall中
        //抽奖号码放在了int[] draw中
        //定义一个数组boolean[] judgeRed，与int[] draw索引一一对应，用来判定draw中的每个元素是否存在于int[] redBall中，也就是是否中奖
        //有一点需要注意：如果中了同一个号码:看彩票中这个号码一共有多少次，设置计数器来确定得了几等奖
        boolean[] judgeRed = new boolean[redBall.length];
        int dupTimes = 0;
        for (int i = 0; i < judgeRed.length; i++) {
            if (existInArray(redBall, draw[i])) {
                judgeRed[i] = true;
                for (int i1 = 0; i1 < i; i1++) {
                    if (draw[i1] == draw[i]) {
                        if (dupTimes == sumFrom0(timesInArray(redBall, draw[i]))) {
                            judgeRed[i] = false;
                        } else {
                            dupTimes++;
                        }
                    }
                }
            }
        }

        //判定蓝球是否中奖
        boolean judgeBlue = drawBlue == blueBall;


        int prize = prizeJudge(judgeRed, judgeBlue);
        if (prize != 0) {
            System.out.println("中了" + prize + "等奖");
        } else {
            System.out.println("很遗憾，未中奖");
        }


    }

    @NotNull
    private static int[] getRedBall(Random rd) {
        int[] redBall = new int[6];
        for (int i = 0; i < redBall.length; i++) {
            redBall[i] = rd.nextInt(33) + 1;
            System.out.print(redBall[i] + " ");
        }
        return redBall;
    }

    public static boolean existInArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int timesInArray(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) count++;
        }
        return count;
    }

    public static int sumFrom0(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int prizeJudge(boolean[] judgeRed, boolean judgeBlue) {
        //先转化成int类型，红球统计中了几个，蓝球中了是1，没中是0;
        int countRed = 0;
        for (int i = 0; i < judgeRed.length; i++) {
            if (judgeRed[i]) countRed++;
        }
        int countBlue;
        if (judgeBlue) {
            countBlue = 1;
        } else {
            countBlue = 0;
        }
        int[][] cons = {
                {0, 6},
                {0, 6},
                {0, 6},
                {0, 5},
                {5, 4},
                {4, 3},
                {2, 1}};

        return cons[countRed][countBlue];
    }
}
