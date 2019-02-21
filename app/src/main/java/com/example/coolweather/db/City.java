package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;   //每一个实体类都有一个id

    private String cityName;  //记录市名称

    private int cityCode;   //几率市的代码

    private int provinceId;  //记录该市的上级省级代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
