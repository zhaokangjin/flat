package com.flat.paas.file.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flat.paas.common.util.bean.BeanUtils;
import com.flat.paas.common.util.data.Page;
//import com.flat.paas.file.domain.FileInfo;
import com.flat.paas.file.domain.FileRegistry;
import com.flat.paas.file.domain.condition.FileRegistryConditon;
import com.flat.paas.file.persistence.FileInfoMapper;
import com.flat.paas.file.persistence.FileRegistryMapper;
import com.flat.paas.file.service.FileRegistryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class FileRegistryServiceImpl implements FileRegistryService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	FileInfoMapper fileInfoMapper;
	@Resource
	FileRegistryMapper fileRegistryMapper;
	
	@Override
	public void insert(FileRegistry record){
		try {
			fileRegistryMapper.insert(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insert>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void insertSelective(FileRegistry record){
		try {
			fileRegistryMapper.insertSelective(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertSelective>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void insertBatch(List<FileRegistry> record) {
		try {
			fileRegistryMapper.insertBatch(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertBatch>>>error:"+e);
			throw e;
		}
	}	
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteByPrimaryKey(String id){
		try {
			fileRegistryMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>deleteByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteByPrimaryKeySoft(String id) {
		try {
			fileRegistryMapper.deleteByPrimaryKeySoft(id);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>deleteByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}	
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteList(List<FileRegistry> record) {
		try {
			fileRegistryMapper.deleteList(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertBatch>>>error:"+e);
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void deleteListSoft(List<FileRegistry> record) {
		try {
			fileRegistryMapper.deleteListSoft(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>insertBatch>>>error:"+e);
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void updateByPrimaryKey(FileRegistry fileInfo) {
		try {
			fileRegistryMapper.updateByPrimaryKey(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
		
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void updateByPrimaryKeySelective(FileRegistry fileInfo) {
		try {
			fileRegistryMapper.updateByPrimaryKeySelective(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateByPrimaryKeySelective>>>error:"+e.getMessage());
			throw e;
		}
		
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void updateList(List<FileRegistry> record) {
		if(null==record || record.size()==0){
			return;
		}
		try {
			fileRegistryMapper.updateList(record);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>updateBatch>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public FileRegistry selectByPrimaryKey(String primaryKey) {
		try {
			return fileRegistryMapper.selectByPrimaryKey(primaryKey);
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>selectByPrimaryKey>>>error:"+e.getMessage());
			throw e;
		}
	}
	@Override
	public PageInfo<FileRegistry> queryList(FileRegistryConditon  recordConditon) throws Exception {
		try {
			FileRegistry fileInfo=recordConditon.getFileRegistry();
			String field=(String) BeanUtils.getFieldValue(recordConditon,"fieldName");
			String fieldValue=field.replaceAll("[A-Z]", "_$0").toUpperCase();
			String sort=(String) BeanUtils.getFieldValue(recordConditon,"sort");
			String sortByField="";
			if(null!=field && null!=sort){
				sortByField=fieldValue+" "+sort.toUpperCase();
			}
			Page page=recordConditon.getPage();
			if(null!=page){
				int pageNum=page.getPageNum();
				int pageSize=page.getPageSize();
				if(pageNum>0 && pageSize>0){
					//分页查询
					PageHelper.startPage(pageNum, pageSize,sortByField);  
				}
			}
			List<FileRegistry> list= fileRegistryMapper.queryList(fileInfo);
			PageInfo<FileRegistry> pageData = new PageInfo<FileRegistry>(list);
			return pageData;
		} catch (Exception e) {
			logger.error("FileInfoServiceImpl>>>queryList>>>error:"+e.getMessage());
			throw e;
		}
	}

}
