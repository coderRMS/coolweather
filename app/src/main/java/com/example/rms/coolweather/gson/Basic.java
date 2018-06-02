package com.example.rms.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rms on 2018/6/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
