package homework;

public class Question8 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 9, 7, 3, 5, 1, 6, 3};
        int[] newArr = fill(arr, 2, 7, 8);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] fill(int[] arr, int fromIndex, int toIndex, int value) {
        if (fromIndex > toIndex) {
            System.out.println("初始索引不能大于终止索引");
            return null;
        } else {
            if (toIndex > arr.length) {
                System.out.println("终止索引不能超出数组边界");
                return null;
            } else {
                for (int i = fromIndex; i < toIndex; i++) {
                    arr[i] = value;
                }
                return arr;
            }
        }
    }
}
