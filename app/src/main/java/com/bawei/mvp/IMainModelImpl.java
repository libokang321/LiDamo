package com.bawei.mvp;

import com.bawei.net.HttpUtil;

/*
 *@Auther:姓名
 *@Date: 时间
 *@Description:功能
 * */public class IMainModelImpl implements IMainContact.IMainModel {

     private HttpUtil util;
     public IMainModelImpl(){
         util = HttpUtil.getUtil();
     }
    @Override
    public void doHttpUtil(String url, HttpUtil.CallBack callBack) {
        util.doHttpGet(url,callBack);
    }
}
