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
	/**
	 * 根据映射文件ID查询真实文件的基本信息
	 * @Title: selectByPrimaryKey   
	 * @Description: 一个相同的文件可能被多个人引用或共享，可以用此信息查询文件的基本信息  
	 * @param fileInfo 
	 * 例如：{"fileId":"000a178f-94ab-11e7-9334-00163e12ae01"}
	 * @return FileInfo fileInfo
	 * 例如：
	 * {"fileId":"000a178f-94ab-11e7-9334-00163e12ae01","originalFile":"ceshi31543","filemd5":"2afsdfddas31543","actualFileName":"2afsdfddas31543.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1504884773000}
	 */
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
	 * 例如:{"fileInfo":{"deleteFlag":"N"},"page":{"pageNum":2,"pageSize":3}}
	 * @return PageInfo<FileInfo> 
	 * 返回带有分页参数的对象
	 * {"pageNum":2,"pageSize":3,"size":3,"startRow":4,"endRow":6,"total":30165,"pages":10055,"list":[{"fileId":"5c50580d-9548-11e7-9334-00163e12ae01","originalFile":"ceshi14","filemd5":"2afsdfddas14","actualFileName":"2afsdfddas14.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000},{"fileId":"5c5b4e75-9548-11e7-9334-00163e12ae01","originalFile":"ceshi15","filemd5":"2afsdfddas15","actualFileName":"2afsdfddas15.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000},{"fileId":"5c6663b6-9548-11e7-9334-00163e12ae01","originalFile":"ceshi16","filemd5":"2afsdfddas16","actualFileName":"2afsdfddas16.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000}],"firstPage":1,"prePage":1,"nextPage":3,"lastPage":8,"isFirstPage":false,"isLastPage":false,"hasPreviousPage":true,"hasNextPage":true,"navigatePages":8,"navigatepageNums":[1,2,3,4,5,6,7,8]}
	 */
	@RequestMapping(value = "queryList", method = RequestMethod.POST)
	public PageInfo<FileInfo> queryList(@RequestBody FileInfoConditon  fileInfoConditon){
		try {
			logger.info("FileInfoController>>>queryList>>>fileInfoConditon:" +JSON.toJSONString(fileInfoConditon));
			return fileInfoService.queryList(fileInfoConditon.getFileInfo(),fileInfoConditon.getPage().getPageNum(),fileInfoConditon.getPage().getPageSize());
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
