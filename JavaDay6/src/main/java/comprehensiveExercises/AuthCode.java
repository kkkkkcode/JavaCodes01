package comprehensiveExercises;

import java.util.Random;

public class AuthCode {
    public static void main(String[] args) {
        Random rd = new Random();
        //生成[65,90]∪[97,122]范围内的随机数，对应大写字母和小写字母的ASCII码范围
        //可以先生成[65,122]范围内的随机数，之后如果随机数落在了[91,96]内，就让它+6，这样就回到了[97,122]中
        char[] code = new char[4];
        for (int i = 0; i < code.length; i++) {
            int letter = rd.nextInt(122 - 65) + 65;
            if (letter >= 91 && letter <= 96) {
                letter += 6;
            }
            code[i] = (char) letter;
        }
        int number = rd.nextInt(10);
        //String result = new String(code);
        String result = String.valueOf(code);
        result += number;
        System.out.println(result);
    }
}
