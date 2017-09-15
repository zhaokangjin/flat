package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.Router;

public interface RouterMapper {
    int deleteByPrimaryKey(String routingId);

    int insert(Router record);

    int insertSelective(Router record);

    Router selectByPrimaryKey(String routingId);

    int updateByPrimaryKeySelective(Router record);

    int updateByPrimaryKey(Router record);
}