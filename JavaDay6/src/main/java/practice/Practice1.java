package practice;

public class Practice1 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {11, 22, 33, 44, 55};
        method(arr);
    }

    public static void method(int[] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) System.out.print(arr[i] + ",");
            else System.out.print(arr[i]);
        }
        System.out.print(']');
    }
}
