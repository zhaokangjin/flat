package com.flat.paas.file.persistence;

import com.flat.paas.file.domain.FileRegistry;

public interface FileRegistryMapper {
    int deleteByPrimaryKey(String filemd5);

    int insert(FileRegistry record);

    int insertSelective(FileRegistry record);

    FileRegistry selectByPrimaryKey(String filemd5);

    int updateByPrimaryKeySelective(FileRegistry record);

    int updateByPrimaryKey(FileRegistry record);
}