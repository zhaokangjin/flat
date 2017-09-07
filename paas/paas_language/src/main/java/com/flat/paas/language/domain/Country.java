package com.flat.paas.language.domain;

public class Country {
    // 国家编码 >>>表字段 : COUNTRY_CODE
    private String countryCode;

    // 中文名 >>>表字段 : CHIANESE_NAME
    private String chianeseName;

    // 英文名 >>>表字段 : ENGLISH_NAME
    private String englishName;

    // 电话代码 >>>表字段 : PHONE_CODE
    private String phoneCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getChianeseName() {
        return chianeseName;
    }

    public void setChianeseName(String chianeseName) {
        this.chianeseName = chianeseName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}