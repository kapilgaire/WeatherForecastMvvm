package com.example.weatherforecastmvvm.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)