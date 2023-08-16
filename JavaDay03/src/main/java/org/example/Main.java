package org.example;

// 按两次 ⇧ 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
        int x=10;
        int y=x++;
        int z=++x;
        System.out.println(x);//12
        System.out.println(y);//10
        System.out.println(z);//12
    }
}
