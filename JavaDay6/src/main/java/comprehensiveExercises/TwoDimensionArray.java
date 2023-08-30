package comprehensiveExercises;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //需要把数据分组管理时，就需要二维数组
        //1.二维数组的静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //以后建议这样定义：把每一个一维数组单独写成一行
        //注意：每一个一维数组其实是二维数组中的元素，所以每一个一维数组之间需要用逗号隔开
        //最后一个一维数组后面不需要加逗号
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}};

        //2.获取元素
        //arr:二维数组
        //i:二维数组的索引，获取出来的是里面的一维数组
        //j:表示一维数组的索引，获取出来的是里面的一维数组中的元素

//        System.out.println(arr1[0][0]);//1
//        System.out.println(arr1[1][3]);//8
        arr1[0][0] = 100;
        arr1[1][3] = 1000;
//        System.out.println(arr1[0][0]);//100
        //arr3[0]:二维数组中的第一个一维数组
        //arr3[0][0]:获取第一个一维数组中0索引的元素
//        System.out.println(arr3[0][0]);//[I@1b2c6ec2 地址值
//        System.out.println(arr3[1][4]);//打印数字8

        //二维数组遍历
        for (int i = 0; i < arr3.length; i++) {
            //i:表示二维数组中的每一个索引
            //arr3[i]:表示二维数组中的每一个元素（一维数组）
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }



    }


}
