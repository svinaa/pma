package com.example.krvell.weatherapp.Retrofit;

import com.example.krvell.weatherapp.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLocation(@Query("lat") String lat,
                                                   @Query("lon") String lon,
                                                   @Query("appid") String appid,
                                                   @Query("units") String unit);
}
