package com.flat.paas.portal.domain;

public class ExternalUser {
    // 外部用户ID >>>表字段 : EXTERNAL_USER_ID
    private String externalUserId;

    // 资源组ID >>>表字段 : RESOURCES_GROUP_ID
    private String resourcesGroupId;

    // 姓名 >>>表字段 : NAME
    private String name;

    // 性别 >>>表字段 : SEX
    private String sex;

    // 户籍地址 >>>表字段 : REGISTER_ADDRESS
    private String registerAddress;

    // 居住地址 >>>表字段 : LIVE_ADDRESS
    private String liveAddress;

    // 邮箱 >>>表字段 : MAIL
    private String mail;

    // 手机号码 >>>表字段 : MOBILE_NUMBER
    private String mobileNumber;

    // 紧急联系人 >>>表字段 : URGENT_CONTACT_PERSON
    private String urgentContactPerson;

    // 紧急联系人手机号码 >>>表字段 : URGENT_CONTACT_PERSON_MOBILE_N
    private String urgentContactPersonMobileN;

    // 身份证号码 >>>表字段 : IDENTITY_CARD_NUMBER
    private String identityCardNumber;

    // 暂住地址 >>>表字段 : STAY_ADDRESS
    private String stayAddress;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public String getResourcesGroupId() {
        return resourcesGroupId;
    }

    public void setResourcesGroupId(String resourcesGroupId) {
        this.resourcesGroupId = resourcesGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUrgentContactPerson() {
        return urgentContactPerson;
    }

    public void setUrgentContactPerson(String urgentContactPerson) {
        this.urgentContactPerson = urgentContactPerson;
    }

    public String getUrgentContactPersonMobileN() {
        return urgentContactPersonMobileN;
    }

    public void setUrgentContactPersonMobileN(String urgentContactPersonMobileN) {
        this.urgentContactPersonMobileN = urgentContactPersonMobileN;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getStayAddress() {
        return stayAddress;
    }

    public void setStayAddress(String stayAddress) {
        this.stayAddress = stayAddress;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}