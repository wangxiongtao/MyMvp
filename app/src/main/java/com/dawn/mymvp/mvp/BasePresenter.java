package com.dawn.mymvp.mvp;

/**
 * Created by Administrator on 2018/6/13 0013.
 */

public class BasePresenter {
    private IView iView;

    public BasePresenter(IView iView) {
        this.iView = iView;
    }
}
