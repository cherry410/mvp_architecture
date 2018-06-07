package com.example.architecture.base;

/**
 * 创建日期：Create by guets on 2018/6/6.
 * 描述：业务逻辑层的基本方法
 * 作者：
 */

public interface IBasePresenter {
    //解除与界面的绑定关系
    void unSubscribe();
}
