package com.flat.paas.language.persistence;

import com.flat.paas.language.domain.International;

public interface InternationalMapper {
    int deleteByPrimaryKey(String internationalId);

    int insert(International record);

    int insertSelective(International record);

    International selectByPrimaryKey(String internationalId);

    int updateByPrimaryKeySelective(International record);

    int updateByPrimaryKey(International record);
}