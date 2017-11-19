package com.yaphets.dataanalyze.utils;

import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * Created by yaphets on 17-11-20.
 */

public class Request {

    public static void httpGetRequest(final String url) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();
                    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
                    Response response = client.newCall(request).execute();
                    String responseData = response.body().string();
                    Logger.d(responseData);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
