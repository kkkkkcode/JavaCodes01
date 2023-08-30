package homework;

public class Question7 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 9, 7};
        int[] newArr = fill(arr, 12);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    public static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
