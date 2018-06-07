package com.example.architecture.base;

/**
 * 创建日期：Create by guets on 2018/6/6.
 * 描述：
 * 作者：
 */

public class BaseCommenPresenter<T extends IBaseView> implements IBasePresenter {

    public T view;

    public BaseCommenPresenter(T view) {
        this.view = view;
    }

    @Override
    public void unSubscribe() {
        this.view = null;
    }
}
