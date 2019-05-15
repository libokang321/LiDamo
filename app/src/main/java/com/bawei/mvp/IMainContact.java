package com.bawei.mvp;

import com.bawei.net.HttpUtil;

/*
 *@Auther:姓名
 *@Date: 时间
 *@Description:契约类
 * */public interface IMainContact {

    public interface IMainView {
        void showList(String result);
    }

    public interface IMainModel {
        void doHttpUtil(String url, HttpUtil.CallBack callBack);
    }

    public interface IMainPresenter {
        void attach(IMainView view);

        void deatch();

        void requestList(String url);
    }
}
