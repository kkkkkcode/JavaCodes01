package comprehensiveExercises;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        //外循环：遍历101~200这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i < 200; i++) {
            if (primeJudge(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("101到200之间有" + count + "个质数");
    }

    public static boolean primeJudge(int num) {
        //寻找质数的循环可以只到这个数的平方根，更加节省内存空间
        //内循环：判断当前数字是否为一个质数
        for (int i = 2; i <= Math.pow(num, 0.5); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
