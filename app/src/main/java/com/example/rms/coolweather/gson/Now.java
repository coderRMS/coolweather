package com.example.rms.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rms on 2018/6/2.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
