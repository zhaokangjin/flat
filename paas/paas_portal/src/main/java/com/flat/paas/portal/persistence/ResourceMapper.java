package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(String resourcesGroupId);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(String resourcesGroupId);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}