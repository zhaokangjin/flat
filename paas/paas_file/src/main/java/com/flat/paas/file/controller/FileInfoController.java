package com.flat.paas.file.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.flat.paas.file.domain.FileInfo;
import com.flat.paas.file.service.FileInfoService;
/**
 * 
 * @ClassName: FileInfoController   
 * @Description: TODO  
 * @author: kangjin.zhao  
 * @date:2017年9月7日 下午10:55:33
 */
@RestController
@RequestMapping("fileInfo")
public class FileInfoController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	FileInfoService fileInfoService;

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(@RequestBody FileInfo fileInfo) {
		try {
			logger.error("FileInfoController>>>insert>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.insert(fileInfo);
			return fileInfo.getFileId();
		} catch (Exception e) {
			logger.error("FileInfoController>>>insert>>>error:" + e.getMessage());
			throw e;
		}
	}
	public String insertSelective(@RequestBody FileInfo fileInfo){
		try {
			logger.error("FileInfoController>>>insertSelective>>>fileInfo:" +JSON.toJSONString(fileInfo));
			//88cd681a-93de-11e7-9334-00163e12ae01
			fileInfoService.insertSelective(fileInfo);
			return fileInfo.getFileId();
		} catch (Exception e) {
			logger.error("FileInfoController>>>insertSelective>>>error:" + e.getMessage());
			throw e;
		}
	}
	public int deleteByPrimaryKey(@RequestBody FileInfo fileInfo){
		try {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.deleteByPrimaryKey(fileInfo.getFileId());
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	public FileInfo selectByPrimaryKey(@RequestBody FileInfo fileInfo){
		logger.error("FileInfoController>>>selectByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
		try {
			return fileInfoService.selectByPrimaryKey(fileInfo.getFileId());
		} catch (Exception e) {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	public List<FileInfo> queryList(@RequestBody FileInfo fileInfo){
		try {
			logger.error("FileInfoController>>>queryList>>>fileInfo:" +JSON.toJSONString(fileInfo));
			return fileInfoService.queryList(fileInfo);
		} catch (Exception e) {
			logger.error("FileInfoController>>>queryList>>>error:" + e.getMessage());
			throw e;
		}
	}
	public int updateByPrimaryKey(@RequestBody FileInfo fileInfo){
		try {
			logger.error("FileInfoController>>>updateByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.updateByPrimaryKey(fileInfo);
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>updateByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	public int updateByPrimaryKeySelective(@RequestBody FileInfo fileInfo){
		try {
			logger.error("FileInfoController>>>updateByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.updateByPrimaryKeySelective(fileInfo);
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>updateByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
}
