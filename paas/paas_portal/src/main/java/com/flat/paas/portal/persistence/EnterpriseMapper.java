package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.Enterprise;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}