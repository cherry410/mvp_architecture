package com.example.architecture.presenter;

import com.example.architecture.base.BaseCommenPresenter;
import com.example.architecture.presenter.basepresenter.LoginBasePresenter;
import com.example.architecture.presenter.baseview.LoginBaseView;

/**
 * 描述：登录逻辑操作层
 */
public class LoginPresenter extends BaseCommenPresenter<LoginBaseView> implements LoginBasePresenter {
    public LoginPresenter(LoginBaseView view) {
        super(view);
    }

    @Override
    public void login(String phone, String pwd) {
        if (phone.equals("null")) {
            view.loginFailure("登录失败");
        } else {
            view.loginSuccess("登录成功");
        }
    }
}
