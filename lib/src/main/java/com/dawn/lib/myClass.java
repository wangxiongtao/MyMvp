package com.dawn.lib;

import java.util.Random;

public class myClass {
    public static void main(String[] args) {
       Long a= 100000000000000000L;
       Long b= 999999999999999999L;
        Long x = (long)(a+Math.random()*(b-a+1));

//        int s=new Random().nextInt(16);
        System.out.println(x);
    }
}
