package comprehensiveExercises;

public class TDMTest {

    public static void main(String[] args) {

        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        //遍历二维数组，得到每一个一维数组并求和
        int yearSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            //yearArrArr[i]一维数组
            int[] quarterArr = yearArrArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度的营业额是" + sum + "元。");
            yearSum += sum;
        }
        System.out.println("全年的营业额是" + yearSum + "元。");
    }


    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
