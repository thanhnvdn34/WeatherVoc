package com.example.myapplication.data.models

import com.google.gson.annotations.SerializedName
import java.util.*

object ApiResponse {
    data class Main(
        @SerializedName("temp")
        val temp: Double,
        @SerializedName("feels_like ")
        val feelsLike : Double?,
        @SerializedName("temp_min")
        val tempMin: Double,
        @SerializedName("temp_max")
        val tempMax: Double,
        @SerializedName("pressure")
        val pressure: Double,
        @SerializedName("sea_level")
        val seaLevel: Double,
        @SerializedName("grnd_level")
        val grndLevel: Double,
        @SerializedName("humidity")
        val humidity: Int
    )

    data class Weather(
        @SerializedName("id")
        val id: Int,
        @SerializedName("main")
        val main: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("icon")
        val icon: String
    )

    data class Clouds(
        @SerializedName("all")
        val all: Int
    )
    data class Wind(
        @SerializedName("speed")
        val speed: Double,
        @SerializedName("deg")
        val deg: Int
    )
    data class Rain(
        @SerializedName("1h")
        val h1: Int?,
        @SerializedName("3h")
        val h3: Int

    )
    data class Snow(
        @SerializedName("1h")
        val h1: Int?,
        @SerializedName("3h")
        val h3: Int
    )
    data class Coord(
        @SerializedName("lon")
        val lon: Double,
        @SerializedName("lat")
        val lat: Double
    )
    data class CurrentResponse(
        @SerializedName("coord")
        val coord: Coord,
        @SerializedName("weather")
        val weathers: List<Weather>,
        @SerializedName("main")
        val main: Main,
        @SerializedName("wind")
        val wind: Wind,
        @SerializedName("clouds")
        val clouds: Clouds,
        @SerializedName("rain")
        val rain: Rain?,
        @SerializedName("snow")
        val snow: Snow?,
        @SerializedName("timezone")
        val timeZone: String,
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("dt")
        val dt: String
    )
    data class city(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("coord")
        val coord: Coord,
        @SerializedName("country")
        val country: String
    )

    data class Forecast3Hours(
        val dt: String,
        val main: Main,
        val weathers: List<Weather>,
        val clouds: Clouds,
        val wind: Wind,
        val rain: Rain?,
        val snow: Snow?
    )
//    data class ForecastResponse {
//
//    }
}

