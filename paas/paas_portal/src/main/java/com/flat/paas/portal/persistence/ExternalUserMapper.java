package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.ExternalUser;

public interface ExternalUserMapper {
    int deleteByPrimaryKey(String externalUserId);

    int insert(ExternalUser record);

    int insertSelective(ExternalUser record);

    ExternalUser selectByPrimaryKey(String externalUserId);

    int updateByPrimaryKeySelective(ExternalUser record);

    int updateByPrimaryKey(ExternalUser record);
}