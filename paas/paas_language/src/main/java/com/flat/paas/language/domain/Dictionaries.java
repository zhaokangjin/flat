package com.flat.paas.language.domain;

public class Dictionaries {
    // 字典ID >>>表字段 : DICTIONARY_ID
    private String dictionaryId;

    // 描述 >>>表字段 : DESCR
    private String descr;

    // 键值 >>>表字段 : KEY_VALUE
    private String keyValue;

    // 字典编码 >>>表字段 : DICTIONARY_CODE
    private String dictionaryCode;

    // 国际化ID >>>表字段 : INTERNATIONAL_ID
    private String internationalId;

    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String getDictionaryCode() {
        return dictionaryCode;
    }

    public void setDictionaryCode(String dictionaryCode) {
        this.dictionaryCode = dictionaryCode;
    }

    public String getInternationalId() {
        return internationalId;
    }

    public void setInternationalId(String internationalId) {
        this.internationalId = internationalId;
    }
}