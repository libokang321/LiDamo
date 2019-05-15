package com.bawei.mvp;

import com.bawei.net.HttpUtil;

/*
 *@Auther:姓名
 *@Date: 时间
 *@Description:功能
 * */public class IMainPresenterImpl implements IMainContact.IMainPresenter {

     private IMainContact.IMainView view;
     private IMainContact.IMainModel model;
     @Override
    public void attach(IMainContact.IMainView view) {
        this.view =view;
        model = new IMainModelImpl();
    }

    @Override
    public void deatch() {
        if (view!= null){
            view = null;
        }
        if (model!= null){
            model = null;
        }
    }

    @Override
    public void requestList(String url) {
        model.doHttpUtil(url, new HttpUtil.CallBack() {
            @Override
            public void onSuccess(String url) {

                view.showList(url);
            }

            @Override
            public void onError(String msg) {

            }
        });
    }
}
