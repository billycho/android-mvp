package com.qwerapps.androidmvp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by IT02106 on 04/05/2018.
 */

public class Ads {
    @SerializedName("id")
    private String id;
    @SerializedName("code")
    public String code;
    @SerializedName("status")
    public String status;

    public Ads(String id, String code, String status) {
        this.id = id;
        this.code = code;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
