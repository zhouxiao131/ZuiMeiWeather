package com.example.mrzhou.zuimeiweather.util;

/**
 * Created by Mr.zhou on 2017/12/25.
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        //调用服务器
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
