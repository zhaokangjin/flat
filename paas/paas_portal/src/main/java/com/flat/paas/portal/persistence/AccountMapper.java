package com.flat.paas.portal.persistence;

import com.flat.paas.portal.domain.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}