package com.example.architecture.base;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 创建日期：Create by guets on 2018/6/6.
 * 描述：
 * 作者：
 */

public abstract class BaseActvity<T extends IBasePresenter> extends AppCompatActivity {

    protected BaseActvity context;

    protected Dialog dialog;

    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        context = this;
        initView();
        bindEvent();
    }

    /**
     * 绑定数据
     */
    protected abstract void bindEvent();

    /**
     * 初始化控件
     */
    protected abstract void initView();

    /**
     * 加载布局id
     *
     * @return
     */
    protected abstract int setLayoutId();

    /**
     * 绑定presenter
     * @param presenter
     */
    public void bindPresenter(T presenter) {
        if (this.presenter == null) {
            this.presenter = presenter;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.unSubscribe();
        }
    }
}
