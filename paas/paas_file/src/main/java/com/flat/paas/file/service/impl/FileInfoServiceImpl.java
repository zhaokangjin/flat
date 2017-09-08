package com.flat.paas.file.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.flat.paas.file.domain.FileInfo;
import com.flat.paas.file.persistence.FileInfoMapper;
import com.flat.paas.file.service.FileInfoService;
import com.github.pagehelper.PageInfo;

@Service
public class FileInfoServiceImpl implements FileInfoService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	FileInfoMapper fileInfoMapper;
	@Override
	public void insert(FileInfo fileInfo){
		try {
			fileInfoMapper.insert(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insert>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	public void insertSelective(FileInfo fileInfo){
		try {
			fileInfoMapper.insertSelective(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertSelective>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	public void deleteByPrimaryKey(@Param("fileId") String fileId){
		try {
			fileInfoMapper.deleteByPrimaryKey(fileId);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>deleteByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	public FileInfo selectByPrimaryKey(@Param("fileId") String fileId) {
		try {
			return fileInfoMapper.selectByPrimaryKey(fileId);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>selectByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	public PageInfo<FileInfo> queryList(FileInfo fileInfo,Integer pageNo,Integer pageSize) {
		try {
			List<FileInfo> list= fileInfoMapper.selectList(fileInfo);
			PageInfo<FileInfo> page = new PageInfo<FileInfo>(list);
			return page;
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>queryList>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	public void updateByPrimaryKey(FileInfo fileInfo) {
		try {
			fileInfoMapper.updateByPrimaryKey(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
		
	}
	@Override
	public void updateByPrimaryKeySelective(FileInfo fileInfo) {
		try {
			fileInfoMapper.updateByPrimaryKeySelective(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateByPrimaryKeySelective>>>error:"+e.getMessage());
			throw e;
		}
		
	}
}
