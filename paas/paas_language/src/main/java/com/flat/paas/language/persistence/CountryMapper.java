package com.flat.paas.language.persistence;

import com.flat.paas.language.domain.Country;

public interface CountryMapper {
    int deleteByPrimaryKey(String countryCode);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(String countryCode);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}