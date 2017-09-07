package com.flat.paas.language.persistence;

import com.flat.paas.language.domain.Dictionaries;

public interface DictionariesMapper {
    int deleteByPrimaryKey(String dictionaryId);

    int insert(Dictionaries record);

    int insertSelective(Dictionaries record);

    Dictionaries selectByPrimaryKey(String dictionaryId);

    int updateByPrimaryKeySelective(Dictionaries record);

    int updateByPrimaryKey(Dictionaries record);
}