package comprehensiveExercises;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入要查询的月份");
        int month = sc.nextInt();
        System.out.println("请输入舱位，0代表头等舱，1代表经济舱");
        int cabin = sc.nextInt();
        double ultiPrice = calculateTicketPrice(price, month, cabin);
        System.out.println(ultiPrice);
    }

    public static double calculateTicketPrice(int price, int month, int cabin) {
        //可以不定义最终价格变量，直接对price进行自我操作
        if (month >= 5 && month <= 10) {
            price = cabinJudge(price, cabin, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            price = cabinJudge(price, cabin, 0.7, 0.65);
        } else {
            System.out.println("不是有效的月份，将显示原价");
        }
        return price;
    }

    public static int cabinJudge(int price, int cabin, double discount0, double discount1) {
        //ctrl + alt + M 自动抽取方法
        switch (cabin) {
            case 0 -> price = (int) (price * discount0);
            case 1 -> price = (int) (price * discount1);
            default -> System.out.println("不是有效的舱位，将显示原价");
        }
        return price;
    }
}