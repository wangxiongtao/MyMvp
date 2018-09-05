package com.dawn.mymvp.test;

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
    }



}
