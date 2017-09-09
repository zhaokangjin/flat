package com.flat.paas.file.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.flat.paas.file.domain.FileInfo;
import com.flat.paas.file.domain.condition.FileInfoConditon;
import com.flat.paas.file.service.FileInfoService;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @ClassName: FileInfoController   
 * @Description: 文件创建及引用查询接口，可以得知该文件的使用频率 
 * @author: kangjin.zhao  
 * @date:2017年9月7日 下午10:55:33
 */
@RestController
@ControllerAdvice
@RequestMapping("fileInfo")
public class FileInfoController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	FileInfoService fileInfoService;

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(@RequestBody FileInfo fileInfo) {
		try {
			logger.info("FileInfoController>>>insert>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.insert(fileInfo);
			return fileInfo.getFileId();
		} catch (Exception e) {
			logger.error("FileInfoController>>>insert>>>error:" + e.getMessage());
			throw e;
		}
	}
	@RequestMapping(value = "insertBatch", method = RequestMethod.POST)
	public List<FileInfo> insertBatch(@RequestBody List<FileInfo> fileInfoList){
		try {
			logger.info("FileInfoController>>>insertSelective>>>fileInfo:" +JSON.toJSONString(fileInfoList));
			for(int i=0;i<fileInfoList.size();i++){
				fileInfoList.get(i).setFileId(UUID.randomUUID().toString());
			} 
			fileInfoService.insertBatch(fileInfoList);
			return fileInfoList;
		} catch (Exception e) {
			logger.error("FileInfoController>>>insertSelective>>>error:" + e.getMessage());
			throw e;
		}
	}
	@RequestMapping(value = "deleteByPrimaryKey", method = RequestMethod.POST)
	public int deleteByPrimaryKey(@RequestBody FileInfo fileInfo){
		try {
			logger.info("FileInfoController>>>deleteByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.deleteByPrimaryKey(fileInfo.getFileId());
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	@RequestMapping(value = "deleteByPrimaryKeySoft", method = RequestMethod.POST)
	public int deleteByPrimaryKeySoft(@RequestBody FileInfo fileInfo){
		try {
			logger.info("FileInfoController>>>deleteByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.deleteByPrimaryKeySoft(fileInfo.getFileId());
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	@RequestMapping(value = "deleteList", method = RequestMethod.POST)
	public int deleteList(@RequestBody List<FileInfo> fileInfoList){
		try {
			logger.info("FileInfoController>>>deleteByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfoList));
			fileInfoService.deleteList(fileInfoList);
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	@RequestMapping(value = "deleteListSoft", method = RequestMethod.POST)
	public int deleteListSoft(@RequestBody List<FileInfo> fileInfoList){
		try {
			logger.info("FileInfoController>>>deleteByPrimaryKey>>>deleteListSoft:" +JSON.toJSONString(fileInfoList));
			fileInfoService.deleteListSoft(fileInfoList);
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	@RequestMapping(value = "selectByPrimaryKey", method = RequestMethod.POST)
	public FileInfo selectByPrimaryKey(@RequestBody FileInfo fileInfo){
		logger.info("FileInfoController>>>selectByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
		try {
			FileInfo retFileInfo= fileInfoService.selectByPrimaryKey(fileInfo.getFileId());
			return retFileInfo;
		} catch (Exception e) {
			logger.error("FileInfoController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	/**
	 * 分页查询接口
	 * @Title: queryList   
	 * @Description: TODO  
	 * @param fileInfoConditon 
	 * @return PageInfo<FileInfo> 
	 * 返回带有分页参数的对象
	 * {"endRow":3,"firstPage":1,"hasNextPage":true,"hasPreviousPage":true,"isFirstPage":false,"isLastPage":false,"lastPage":8,"list":[{"actualFileName":"2afsdfddas19.xls","createTime":1504936602000,"creator":"KANGJIN.ZHAO","deleteFlag":"N","fileId":"ac93f6e4-9523-11e7-9334-00163e12ae01","filemd5":"2afsdfddas19","originalFile":"ceshi19"}],"navigatePages":8,"navigatepageNums":[1,2,3,4,5,6,7,8],"nextPage":4,"pageNum":3,"pageSize":1,"pages":30128,"prePage":2,"size":1,"startRow":3,"total":30128}
	 */
	@RequestMapping(value = "queryList", method = RequestMethod.POST)
	public PageInfo<FileInfo> queryList(@RequestBody FileInfoConditon fileInfoConditon){
		try {
			logger.info("FileInfoController>>>queryList>>>fileInfoConditon:" +JSON.toJSONString(fileInfoConditon));
			// PageHelper.startPage(pageNo, pageSize,"CREATE_TIME DESC"); 
			return fileInfoService.queryList(fileInfoConditon.get(0),fileInfoConditon.getPageNum(),fileInfoConditon.getPageSize());
		} catch (Exception e) {
			logger.error("FileInfoController>>>queryList>>>error:" + e.getMessage());
			throw e;
		}
	}
	public int updateByPrimaryKey(@RequestBody FileInfo fileInfo){
		try {
			logger.info("FileInfoController>>>updateByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.updateByPrimaryKey(fileInfo);
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>updateByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
	public int updateByPrimaryKeySelective(@RequestBody FileInfo fileInfo){
		try {
			logger.info("FileInfoController>>>updateByPrimaryKey>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.updateByPrimaryKeySelective(fileInfo);
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>updateByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}
}
