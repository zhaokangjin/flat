package com.flat.paas.file.service;

import java.util.List;

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
	FileInfo selectByPrimaryKey(String id);

	/**
	 * @Title: queryList  	
	 * @Description: TODO
	 * @param fileInfo
	 * @return
	 */
	PageInfo<FileInfo> queryList(FileInfo record,Integer pageNo,Integer pageSize);

	/**
	 * @Title: insert
	 * @Description: TODO
	 * @param fileInfo
	 * @return
	 */
	void insert(FileInfo record);

	/**
	 * @Title: insertSelective
	 * @Description: TODO
	 * @param fileInfo
	 * @return
	 */
	void insertSelective(FileInfo record);
	
	/**
	 * 
	 * @Title: insertBatch   
	 * @Description: TODO  
	 * @param record
	 */
	void insertBatch(List<FileInfo> record);
	/**
	 * @Title: deleteByPrimaryKey
	 * @Description: TODO
	 * @param fileId
	 */
	void deleteByPrimaryKey(String id);
	/**
	 * 
	 * @Title: deleteByPrimaryKeyS   
	 * @Description: TODO  
	 * @param id
	 */
	void deleteByPrimaryKeySoft(String id);
	void deleteList(List<FileInfo> record);
	
	void deleteListSoft(List<FileInfo> record);
	
	/**
	 * @Title: updateByPrimaryKey
	 * @Description: TODO
	 * @param fileInfo
	 */
	void updateByPrimaryKey(FileInfo record);

	/**
	 * @Title: updateByPrimaryKeySelective
	 * @Description: TODO
	 * @param fileInfo
	 */
	void updateByPrimaryKeySelective(FileInfo record);

}
