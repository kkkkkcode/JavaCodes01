package homework;

public class Question9And10 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 9, 7, 3, 5, 1, 6, 3};
        int[] newArr = copyOf(arr, 6);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        int[] newArr2 = copyOfRange(arr, 2, 8);
        for (int i = 0; i < newArr2.length; i++) {
            System.out.print(newArr2[i] + " ");
        }

    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        if (from > to) {
            System.out.println("开始索引不能大于终止索引");
            return null;
        } else {
            if (to > arr.length) {
                System.out.println("终止索引不能超过数组范围");
                return null;
            } else {
                for (int i = from; i < to; i++) {
                    newArr[i - from] = arr[i];
                }
                return newArr;
            }
        }
    }
}
