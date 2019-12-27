package com.example.myapplication.domain.model

import com.google.gson.annotations.SerializedName

class CurrentWeatherDetailModel {

    @SerializedName(value = "sys")
    var sys: Sys? = null
}