package homework;

public class Question6 {
    public static void main(String[] args) {
        int[] array1 = {1,6,8};
        int[] array2 = {1,8,8};
        System.out.println(equalArray(array1,array2));
    }

    public static boolean equalArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) return false;
            }
            return true;
        }

    }
}
