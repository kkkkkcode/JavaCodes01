package com.itheima.write2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "婧婧";
        gf1.age = 18;
        gf1.gender = "萌妹子";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        

        System.out.println("================================================================");

        GirlFriend gf2 = new GirlFriend();
        gf2.name = "琳琳";
        gf2.age = 19;
        gf2.gender = "萌妹子";

        //拖动鼠标滚轮向下
        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.eat();
       
    }


}
