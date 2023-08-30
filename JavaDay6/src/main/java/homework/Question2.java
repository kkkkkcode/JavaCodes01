package homework;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(getMax(3, 3, 5));
    }

    public static int getMax(int a, int b, int c) {
        if (a > b) {
            return a > c ? a : c;
        } else {
            return b > c ? b : c;
        }
    }
}
