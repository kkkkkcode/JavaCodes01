package comprehensiveExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Mark {
    private static final int judgesNum = 6;

    public static void main(String[] args) {
        int[] marks = getMarks(judgesNum);
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        int sum = Arrays.stream(marks).sum();
        System.out.println("总分是" + sum);
        Result minResult = findMin(marks);
        System.out.println("最低分是" + minResult.value + "来自评委" + (minResult.index + 1) + "号");
        Result maxResult = findMax(marks);
        System.out.println("最高分是" + maxResult.value + "来自评委" + (maxResult.index + 1) + "号");
        int calcSum = sum - minResult.value - maxResult.value;
        int avg = calcSum / (judgesNum - 2);
        System.out.println("最终得分是" + avg);
    }

    private static int[] getMarks(int num) {
        //在输入评委打分时，可以用控制循环的方式确保所有评委打分有效
        //把for循环的控制语句i++从for后面的小括号内移到下方循环语句体的一个if判断中
        //如果评委打分在[0,100]内，则i++，否则i不自增，重新输入当前这位评委的打分
        int[] marks = new int[num];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; ) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分");
            marks[i] = sc.nextInt();
            if (marks[i] >= 0 && marks[i] <= 100) {
                i++;
            } else {
                System.out.println("超出评分范围，请重新输入当前第" + (i + 1) + "位评委的评分");
            }
        }
        return marks;
    }

    static class Result {
        int value;
        int index;
    }

    public static Result findMin(int[] array) {
        Result result = new Result();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                result.index = i;
            }
        }
        result.value = min;
        return result;
    }

    public static Result findMax(int[] array) {
        Result result = new Result();
        //选择min，按住shift+F6改成max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                result.index = i;
            }
        }
        result.value = max;
        return result;
    }
}
