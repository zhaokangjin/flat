package com.flat.paas.file.service;

import com.flat.paas.file.domain.FileInfo;
import com.github.pagehelper.PageInfo;

/**
 * 文件信息服务接口
 * @ClassName: FileInfoService
 * @Description: 文件信息服务接口
 * @author: kangjin.zhao
 * @date:2017年9月7日 下午10:01:51
 */
public interface FileInfoService {
	/**
	 * @Title: selectByPrimaryKey
	 * @Description: TODO
	 * @param fileId
	 * @return
	 */
	FileInfo selectByPrimaryKey(String fileId);

	/**
	 * @Title: queryList  	
	 * @Description: TODO
	 * @param fileInfo
	 * @return
	 */
	PageInfo<FileInfo> queryList(FileInfo fileInfo,Integer pageNo,Integer pageSize);

	/**
	 * @Title: insert
	 * @Description: TODO
	 * @param fileInfo
	 * @return
	 */
	void insert(FileInfo fileInfo);

	/**
	 * @Title: insertSelective
	 * @Description: TODO
	 * @param fileInfo
	 * @return
	 */
	void insertSelective(FileInfo fileInfo);

	/**
	 * @Title: deleteByPrimaryKey
	 * @Description: TODO
	 * @param fileId
	 */
	void deleteByPrimaryKey(String fileId);

	/**
	 * @Title: updateByPrimaryKey
	 * @Description: TODO
	 * @param fileInfo
	 */
	void updateByPrimaryKey(FileInfo fileInfo);

	/**
	 * @Title: updateByPrimaryKeySelective
	 * @Description: TODO
	 * @param fileInfo
	 */
	void updateByPrimaryKeySelective(FileInfo fileInfo);

}
