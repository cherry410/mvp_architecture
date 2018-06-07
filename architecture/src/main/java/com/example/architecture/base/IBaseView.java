package com.example.architecture.base;

/**
 * 创建日期：Create by guets on 2018/6/6.
 * 描述：界面UI的响应变化
 * 作者：
 */

public interface IBaseView {
    //显示加载loading
    void showLoadingDialog();

    //取消加载loading
    void hideLoadingDialog();
}
