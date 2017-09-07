package com.flat.paas.file.persistence;

import java.util.List;

import com.flat.paas.file.domain.FileInfo;

public interface FileInfoMapper {
	/**
	 * 
	 * @Title: deleteByPrimaryKey
	 * @Description: TODO
	 * @param fileId
	 * @return
	 */
	int deleteByPrimaryKey(String fileId);

	/**
	 * 
	 * @Title: insert
	 * @Description: TODO
	 * @param record
	 * @return
	 */
	int insert(FileInfo record);

	/**
	 * 
	 * @Title: insertSelective
	 * @Description: TODO
	 * @param record
	 * @return
	 */
	int insertSelective(FileInfo record);

	/**
	 * 
	 * @Title: selectByPrimaryKey
	 * @Description: TODO
	 * @param fileId
	 * @return
	 */
	FileInfo selectByPrimaryKey(String fileId);

	/**
	 * 
	 * @Title: queryList
	 * @Description: TODO
	 * @param fileId
	 * @return
	 */
	List<FileInfo> queryList(FileInfo fileId);

	/**
	 * 
	 * @Title: updateByPrimaryKeySelective
	 * @Description: TODO
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(FileInfo record);

	/**
	 * 
	 * @Title: updateByPrimaryKey
	 * @Description: TODO
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(FileInfo record);
}