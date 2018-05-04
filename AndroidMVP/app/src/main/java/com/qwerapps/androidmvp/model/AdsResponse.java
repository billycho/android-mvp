package com.qwerapps.androidmvp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by IT02106 on 04/05/2018.
 */

public class AdsResponse {
    @SerializedName("adswitch")
    private List<Ads> ads;

    public List<Ads> getAds() {
        return ads;
    }

    public void setAds(List<Ads> ads) {
        this.ads = ads;
    }

    public AdsResponse(List<Ads> ads) {

        this.ads = ads;
    }
}
