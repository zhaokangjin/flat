package com.flat.paas.portal.persistence;

import java.util.List;

import com.flat.paas.portal.domain.MobileUser;

public interface MobileUserMapper {
    int deleteByPrimaryKey(String mobileappUserId);

    int insert(MobileUser record);

    int insertSelective(MobileUser record);

    MobileUser selectByPrimaryKey(String mobileappUserId);

    int updateByPrimaryKeySelective(MobileUser record);

    int updateByPrimaryKey(MobileUser record);
    
    List<MobileUser> queryList(MobileUser record);
}