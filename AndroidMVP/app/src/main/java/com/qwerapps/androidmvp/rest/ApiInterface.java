package com.qwerapps.androidmvp.rest;

import com.qwerapps.androidmvp.model.Ads;
import com.qwerapps.androidmvp.model.AdsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by IT02106 on 04/05/2018.
 */

public interface ApiInterface {
    @GET("admanager.php")
    Call<AdsResponse> getAds(@Query("app_id") String appId);
}
