package com.itheima.write;

public class Test2 {


    public static void main(String[] args) {
        //汽车无人驾驶会涉及到大量的判断
        //当汽车行驶的时候遇到了红绿灯，就会进行判断
        //如果红灯亮，就停止
        //如果黄灯亮，就减速
        //如果绿灯亮，就行驶


        //1.定义三个变量表示灯的状态
        //true 亮  false 灭
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;
        //2.判断
        //红灯亮，就停止
        //黄灯亮，就减速
        //绿灯亮，就行驶
        if(isLightGreen){
            System.out.println("GoGoGo!!!");
        }
        else if(isLightYellow){
            System.out.println("slow!!!");
        }
        else if(isLightRed){
            System.out.println("stop!!!");
        }
        /*
        if的第一种格式：单条件判断
        if的第二种格式：双条件判断
        if的第三种格式：多条件判断
         */
    }
}
