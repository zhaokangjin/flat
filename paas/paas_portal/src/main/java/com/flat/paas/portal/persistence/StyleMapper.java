package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.Style;

public interface StyleMapper {
    int deleteByPrimaryKey(String sytleId);

    int insert(Style record);

    int insertSelective(Style record);

    Style selectByPrimaryKey(String sytleId);

    int updateByPrimaryKeySelective(Style record);

    int updateByPrimaryKey(Style record);
}