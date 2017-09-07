package com.flat.paas.language.domain;

public class DictionariesItem extends DictionariesItemKey {
    // 描述 >>>表字段 : DESCR
    private String descr;

    // 条目编码 >>>表字段 : ITEM_CODE
    private String itemCode;

    // 国际化ID >>>表字段 : INTERNATIONAL_ID
    private String internationalId;

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getInternationalId() {
        return internationalId;
    }

    public void setInternationalId(String internationalId) {
        this.internationalId = internationalId;
    }
}