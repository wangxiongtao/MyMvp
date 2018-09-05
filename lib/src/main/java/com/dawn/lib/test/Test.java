package com.dawn.lib.test;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Administrator on 2018/6/14 0014.
 */

public class Test extends BaseTest implements IITest {
    @Override
    public void showMyStr(String s) {

    }

    public static void main(String[] args) {
        IITest test=new Test();
        test.showStr("dsada");
        System.out.println(fromatTwoDecimal("269.9"));

        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        map.put("1","a");
        map.put("1","b");
        map.put("1","c");
        map.put("1","d");
        System.out.println("==HashMap======>"+map.get("2"));

    }

    /**
     * 保留两位小数
     */
    public static String fromatTwoDecimal(String str){
        DecimalFormat format=new DecimalFormat("0");
        Double d=Double.parseDouble(str);
        return format.format(d);

    }



}
