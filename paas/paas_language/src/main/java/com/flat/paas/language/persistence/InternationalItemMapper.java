package com.flat.paas.language.persistence;

import com.flat.paas.language.domain.InternationalItem;

public interface InternationalItemMapper {
    int deleteByPrimaryKey(String itemId);

    int insert(InternationalItem record);

    int insertSelective(InternationalItem record);

    InternationalItem selectByPrimaryKey(String itemId);

    int updateByPrimaryKeySelective(InternationalItem record);

    int updateByPrimaryKey(InternationalItem record);
}