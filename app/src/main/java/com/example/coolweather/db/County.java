package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

import java.sql.Struct;

public class County extends DataSupport {

    private int id;//每一个实体类都需有一个id

    private String countyName; //记录区县名称

    private int countyCode;//记录区县代码

    private String weatherId;//记录该区县的天气信息

    private int cityId;//该区县所属的市级代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
