package practice;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 9, 7, 3, 5, 1, 6, 3};
        int max = method(arr);
        System.out.println(max);
    }

    public static int method(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }
}
