package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.Navigation;

public interface NavigationMapper {
    int deleteByPrimaryKey(String navigationId);

    int insert(Navigation record);

    int insertSelective(Navigation record);

    Navigation selectByPrimaryKey(String navigationId);

    int updateByPrimaryKeySelective(Navigation record);

    int updateByPrimaryKey(Navigation record);
}