package com.flat.paas.language.domain;

public class DictionariesItemKey {
    // 字典ID >>>表字段 : DICTIONARY_ID
    private String dictionaryId;

    // 键值 >>>表字段 : KEY_VALUE
    private String keyValue;

    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }
}