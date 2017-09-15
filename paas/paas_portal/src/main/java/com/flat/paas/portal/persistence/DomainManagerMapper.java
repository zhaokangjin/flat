package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.DomainManager;

public interface DomainManagerMapper {
    int deleteByPrimaryKey(String domainManageId);

    int insert(DomainManager record);

    int insertSelective(DomainManager record);

    DomainManager selectByPrimaryKey(String domainManageId);

    int updateByPrimaryKeySelective(DomainManager record);

    int updateByPrimaryKey(DomainManager record);
}