package homework;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(absValue(-7.8));
    }
    public static double absValue(double number) {
        return number >= 0 ? number : -number;
    }
}
