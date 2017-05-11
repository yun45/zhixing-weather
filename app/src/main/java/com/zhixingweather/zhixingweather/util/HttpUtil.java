package com.zhixingweather.zhixingweather.util;

import android.app.DownloadManager;

/**
 * Created by Administrator on 2017-05-11.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkhttpClient client = new OkhttpClient();
        Request request = new Request.Builder().url(address).build();
        Client.newCall(request).enqueue(callback);
    }
}
