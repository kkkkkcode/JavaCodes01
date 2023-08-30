package homework;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(getMin(3.5, 5.2));
        System.out.println(getMin(7.2, 5.1));
        System.out.println(getMin(-7.5, -5.7));
    }

    public static double getMin(double a, double b) {
        return a < b ? a : b;
    }
}
