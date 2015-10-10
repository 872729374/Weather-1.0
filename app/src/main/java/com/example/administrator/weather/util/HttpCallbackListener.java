package com.example.administrator.weather.util;

/**
 * Created by Administrator on 2015/9/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);


}
