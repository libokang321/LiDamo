package com.bawei.net;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/*
 *@Auther:姓名
 *@Date: 时间
 *@Description:工具类
 * */public class HttpUtil {
    //懒汉
    private HttpUtil() {
    }

    private static HttpUtil util;

    public synchronized static HttpUtil getUtil() {
        if (util == null) {
            util = new HttpUtil();
        }
        return util;
    }

    //
    public void doHttpGet(String url, final CallBack callBack) {
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callBack.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.onError(error.getMessage());
            }
        });
        MyApplication.getQueue().add(stringRequest);
    }

    //接口
    public interface CallBack {
        void onSuccess(String url);

        void onError(String msg);
    }
}
