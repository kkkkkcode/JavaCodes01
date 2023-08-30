package practice;

public class Practice3 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 9, 7, 3, 5, 1, 6, 3};
        boolean result = existInArray(arr, 9);
        System.out.println(result);
    }

    //我干这件事情，需要数组和要判定的值
    public static boolean existInArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
