package com.example.architecture.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.architecture.R;
import com.example.architecture.base.BaseActvity;
import com.example.architecture.presenter.LoginPresenter;
import com.example.architecture.presenter.baseview.LoginBaseView;

/**
 * 创建日期：Create by guets on 2018/6/6.
 * 描述：
 * 作者：山海边Androdid开发
 */

public class LoginActivity extends BaseActvity<LoginPresenter> implements LoginBaseView {

    private EditText etPhone;

    @Override
    protected void bindEvent() {

    }

    @Override
    protected void initView() {
        etPhone = findViewById(R.id.et_phone);
        bindPresenter(new LoginPresenter(this));
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void showLoadingDialog() {

    }

    @Override
    public void hideLoadingDialog() {

    }

    @Override
    public void loginSuccess(String msg) {
        Toast.makeText(LoginActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailure(String erro) {
        Toast.makeText(LoginActivity.this, erro, Toast.LENGTH_SHORT).show();
    }

    public void login(View view) {
        String phone = etPhone.getText().toString();
        if (phone == null || TextUtils.isEmpty(phone)) {
            Toast.makeText(LoginActivity.this, "请输入登录手机号", Toast.LENGTH_SHORT).show();
        } else {
            presenter.login(phone, "111111");
        }
    }

}
