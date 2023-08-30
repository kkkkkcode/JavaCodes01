package comprehensiveExercises;

import java.util.Random;
import java.util.Scanner;

public class LotteryAwei {
    public static void main(String[] args) {
        int[] arr = createNumber();
        System.out.println("========================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("========================");
        int[] userInputArr = userInputNumber();

        //判断用户中奖情况
        int redCount = 0;
        int blueCount = 0;

        //判断红球中奖情况
        for (int i = 0; i < userInputArr.length - 1; i++) {
            for (int lotteryNumber : arr) {
                if (userInputArr[i] == lotteryNumber) {
                    redCount++;
                    break;
                    //如果找到了，那么后面的数字就没有比较的必要了
                    //跳出内循环，继续判断下一个红球号码是否中奖
                }
            }
        }

        if (arr[arr.length - 1] == userInputArr[userInputArr.length - 1]) {
            blueCount++;
        }
//        System.out.println(redCount);
//        System.out.println(blueCount);
        int[][] cons = {
                {0, 6},
                {0, 6},
                {0, 6},
                {0, 5},
                {5, 4},
                {4, 3},
                {2, 1}};
        int prize = cons[redCount][blueCount];
        switch (prize) {
            case 1 -> System.out.println("恭喜你，中奖1000万");
            case 2 -> System.out.println("恭喜你，中奖500万");
            case 3 -> System.out.println("恭喜你，中奖3000元");
            case 4 -> System.out.println("恭喜你，中奖200元");
            case 5 -> System.out.println("恭喜你，中奖10元");
            case 6 -> System.out.println("恭喜你，中奖5元");
            default -> System.out.println("谢谢惠顾");
        }
    }

    public static int[] createNumber() {
        //1.创建数组添加中奖号码
        int[] arr = new int[7];
        //2.随机生成号码并添加到数组当中
        //红球：不能重复
        //蓝球：可以和红球重复

        //生成红球号码并添加到数组中
        Random rd = new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
            int redNumber = rd.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码
        int blueNumber = rd.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;

    }

    public static int[] userInputNumber() {
        //1.添加数组用于添加用户购买的彩票号码
        int[] arr = new int[7];
        //2.利用键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入彩票上的第" + (i + 1) + "个红球号码");
            //红球号码 1~33 唯一不重复
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前数字已存在，请重新输入彩票上的第" + (i + 1) + "个红球号码");
                }
            } else {
                System.out.println("号码无效，请重新输入彩票上的第" + (i + 1) + "个红球号码");
            }
        }
        while (true) {
            System.out.println("请输入彩票上的蓝球号码");
            arr[arr.length - 1] = sc.nextInt();
            if (!(arr[arr.length - 1] >= 1 && arr[arr.length - 1] <= 16)) {
                System.out.println("号码无效，请重新输入彩票上的蓝球号码");
            } else {
                break;
            }
        }
        return arr;
    }


    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
