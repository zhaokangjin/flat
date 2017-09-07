package com.flat.paas.file.persistence;

import com.flat.paas.file.domain.FileInfo;

public interface FileInfoMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(FileInfo record);

    int insertSelective(FileInfo record);

    FileInfo selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(FileInfo record);

    int updateByPrimaryKey(FileInfo record);
}