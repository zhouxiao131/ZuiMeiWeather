package com.example.mrzhou.zuimeiweather.gson;

/**
 * Created by Mr.zhou on 2017/12/25.
 */
import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
