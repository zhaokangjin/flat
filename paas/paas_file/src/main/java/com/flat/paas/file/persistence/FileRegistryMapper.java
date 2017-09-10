package com.flat.paas.file.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.flat.paas.file.domain.FileRegistry;

public interface FileRegistryMapper {
    
	/**
	 * 该接口提供单条新增服务
	 * @Title: insert
	 * @Description: 单条新增
	 * @param record
	 * @return
	 */
	int insert(FileRegistry record);
	
	/**
	 * 该接口条件单条新增服务
	 * @Title: insertSelective
	 * @Description: 单条新增
	 * @param record
	 * @return
	 */
	int insertSelective(FileRegistry record);
	
	/**
	 * 该接口提供批量新增服务
	 * @Title: insertByBatch   
	 * @Description: 批量新增 
	 * @param record
	 * @return
	 */
	int insertBatch(List<FileRegistry> record);
	
	/**
	 * 该接口提供单条物理删除服务
	 * @Title: deleteByPrimaryKey
	 * @Description: 单条物理删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(@Param("id")String id);
	/**
	 * 该接口提供物理批量删除服务
	 * @Title: deleteList   
	 * @Description: 物理批量删除 
	 * @param record
	 * @return
	 */
	int deleteList(List<FileRegistry> record);
	
	/**
	 * 该接口提供单条软删除服务
	 * @Title: softDelete   
	 * @Description: 单条软删除  
	 * @param id
	 */
	void deleteByPrimaryKeySoft (@Param("id")String fileId);
	
	/**
	 * 该接口提供批量软删除服务
	 * @Title: softDeleteList   
	 * @Description: 批量软删除 
	 * @param record
	 */
	void deleteListSoft(List<FileRegistry> record);
	
	/**
	 * 该接口提供有条件单条更新服务
	 * @Title: updateByPrimaryKey
	 * @Description: 有条件单条更新
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(FileRegistry record);
	
	/**
	 * 该接口提供单条更新服务
	 * @Title: updateByPrimaryKeySelective
	 * @Description: 提供单条更新
	 * @param record
	 * @return
	 */
	void updateByPrimaryKeySelective(FileRegistry record);

	/**
	 * 该接口提供批量更新服务
	 * @Title: updateBatch   
	 * @Description: 批量更新 
	 * @param record
	 * @return
	 */
	void updateList(List<FileRegistry> record);
	/**
	 * 该接口提供单条查询服务
	 * @Title: selectByPrimaryKey
	 * @Description: 单条查询
	 * @param id
	 * @return
	 */
	FileRegistry selectByPrimaryKey(@Param("id")String id);
	
	/**
	 * 该接口提供批量查询服务
	 * @Title: queryList
	 * @Description: 批量查询
	 * @param record
	 * @return
	 */
	List<FileRegistry> queryList(FileRegistry record);	
}