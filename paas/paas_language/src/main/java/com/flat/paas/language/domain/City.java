package com.flat.paas.language.domain;

public class City {
    // 城市ID >>>表字段 : CITY_ID
    private Integer cityId;

    // 父ID >>>表字段 : PARENT_ID
    private Integer parentId;

    // 编码 >>>表字段 : CODE
    private String code;

    // 名称 >>>表字段 : NAME
    private String name;

    // 首字母 >>>表字段 : FIRST_LETTER
    private String firstLetter;

    // 层级 >>>表字段 : LEVEL
    private Integer level;

    // 国家编码 >>>表字段 : COUNTRY_CODE
    private String countryCode;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}