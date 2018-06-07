package com.example.architecture.presenter.baseview;

import com.example.architecture.base.IBaseView;

/**
 * 描述：
 */
public interface LoginBaseView extends IBaseView {
    void loginSuccess(String msg);

    void loginFailure(String erro);
}
