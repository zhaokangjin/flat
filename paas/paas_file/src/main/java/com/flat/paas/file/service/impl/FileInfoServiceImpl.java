package com.flat.paas.file.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flat.paas.common.util.bean.BeanUtils;
import com.flat.paas.common.util.data.Page;
import com.flat.paas.file.domain.FileInfo;
import com.flat.paas.file.domain.condition.FileInfoConditon;
import com.flat.paas.file.persistence.FileInfoMapper;
import com.flat.paas.file.service.FileInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
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
	@Transactional(rollbackFor=Exception.class)
	public void insertSelective(FileInfo fileInfo){
		try {
			fileInfoMapper.insertSelective(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertSelective>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void insertBatch(List<FileInfo> record) {
		try {
			fileInfoMapper.insertBatch(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertBatch>>>error:"+e);
			throw e;
		}
	}	
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteByPrimaryKey(String primaryKey){
		try {
			fileInfoMapper.deleteByPrimaryKey(primaryKey);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>deleteByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteByPrimaryKeySoft(String primaryKey) {
		try {
			fileInfoMapper.deleteByPrimaryKeySoft(primaryKey);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>deleteByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}	
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteList(List<FileInfo> record) {
		try {
			fileInfoMapper.deleteList(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertBatch>>>error:"+e);
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteListSoft(List<FileInfo> record) {
		try {
			fileInfoMapper.deleteListSoft(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertBatch>>>error:"+e);
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void updateByPrimaryKey(FileInfo fileInfo) {
		try {
			fileInfoMapper.updateByPrimaryKey(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
		
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void updateByPrimaryKeySelective(FileInfo fileInfo) {
		try {
			fileInfoMapper.updateByPrimaryKeySelective(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateByPrimaryKeySelective>>>error:"+e.getMessage());
			throw e;
		}
		
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void updateList(List<FileInfo> record) {
		if(null==record || record.size()==0){
			return;
		}
		try {
			//根据主键确定数据来源是新增还是更新
			for(int i=0;i<record.size();i++){
				if(null==record.get(i).getFileId()||record.get(i).getFileId().trim().equals("")){
					record.get(i).setFileId(UUID.randomUUID().toString());
				}
			}
			fileInfoMapper.updateList(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateBatch>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public FileInfo selectByPrimaryKey(String primaryKey) {
		try {
			return fileInfoMapper.selectByPrimaryKey(primaryKey);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>selectByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	public PageInfo<FileInfo> queryList(FileInfoConditon  fileInfoConditon) throws Exception {
		try {
			FileInfo fileInfo=fileInfoConditon.getFileInfo();
			String field=(String) BeanUtils.getFieldValue(fileInfoConditon,"fieldName");
			String sort=(String) BeanUtils.getFieldValue(fileInfoConditon,"sort");
			String fieldValue=null;
			String sortByField="";
			if(null!=field && !field.trim().equals("") && null!=sort && !sort.trim().equals("")){
				fieldValue=field.replaceAll("[A-Z]", "_$0").toUpperCase();
				sortByField=fieldValue+" "+sort.toUpperCase();
			}
			Page page=fileInfoConditon.getPage();
			if(null!=page){
				int pageNum=page.getPageNum();
				int pageSize=page.getPageSize();
				if(pageNum>0 && pageSize>0){
					//分页查询
					PageHelper.startPage(pageNum, pageSize,sortByField);  
				}
			}
			List<FileInfo> list= fileInfoMapper.queryList(fileInfo);
			PageInfo<FileInfo> pageData = new PageInfo<FileInfo>(list);
			return pageData;
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>queryList>>>error:"+e.getMessage());
			throw e;
		}
	}
}
