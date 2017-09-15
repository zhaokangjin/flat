package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.AccountControl;
import com.flat.paas.portal.domain.AccountControlKey;

public interface AccountControlMapper {
    int deleteByPrimaryKey(AccountControlKey key);

    int insert(AccountControl record);

    int insertSelective(AccountControl record);

    AccountControl selectByPrimaryKey(AccountControlKey key);

    int updateByPrimaryKeySelective(AccountControl record);

    int updateByPrimaryKey(AccountControl record);
}