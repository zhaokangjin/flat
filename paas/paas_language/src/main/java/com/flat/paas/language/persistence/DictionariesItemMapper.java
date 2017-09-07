package com.flat.paas.language.persistence;

import com.flat.paas.language.domain.DictionariesItem;
import com.flat.paas.language.domain.DictionariesItemKey;

public interface DictionariesItemMapper {
    int deleteByPrimaryKey(DictionariesItemKey key);

    int insert(DictionariesItem record);

    int insertSelective(DictionariesItem record);

    DictionariesItem selectByPrimaryKey(DictionariesItemKey key);

    int updateByPrimaryKeySelective(DictionariesItem record);

    int updateByPrimaryKey(DictionariesItem record);
}