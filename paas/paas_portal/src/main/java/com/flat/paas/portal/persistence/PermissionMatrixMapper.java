package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.PermissionMatrix;
import com.flat.paas.portal.domain.PermissionMatrixKey;

public interface PermissionMatrixMapper {
    int deleteByPrimaryKey(PermissionMatrixKey key);

    int insert(PermissionMatrix record);

    int insertSelective(PermissionMatrix record);

    PermissionMatrix selectByPrimaryKey(PermissionMatrixKey key);

    int updateByPrimaryKeySelective(PermissionMatrix record);

    int updateByPrimaryKey(PermissionMatrix record);
}