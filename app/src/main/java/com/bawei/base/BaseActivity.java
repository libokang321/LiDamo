package com.bawei.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bawei.R;

/*
 *@Auther:姓名
 *@Date: 时间
 *@Description:基类
 * */public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        bindView();
        bindData();
    }

    protected abstract int bindLayout();

    protected abstract void bindView();

    protected abstract void bindData();


}
