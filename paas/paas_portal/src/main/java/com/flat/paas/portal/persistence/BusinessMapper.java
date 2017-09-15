package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.Business;

public interface BusinessMapper {
    int deleteByPrimaryKey(String tableId);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(String tableId);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}