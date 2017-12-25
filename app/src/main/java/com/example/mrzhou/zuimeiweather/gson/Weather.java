package com.example.mrzhou.zuimeiweather.gson;

/**
 * Created by Mr.zhou on 2017/12/25.
 */


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
