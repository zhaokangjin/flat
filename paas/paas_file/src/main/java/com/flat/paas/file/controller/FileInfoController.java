package com.flat.paas.file.controller;

import java.util.Date;
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
			fileInfo.setCreateTime(new Date());
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
				fileInfoList.get(i).setCreateTime(new Date());
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
	 * @Description: 规范：所有需要分页查询的接口,条件对象必须继承page对象，前台参数必须给定。需要按指定字段排序的，必须给出该字段对应的属性以及升序还是降序规则
	 * @param fileInfoConditon  
	 * 例如:
	 * {"fileInfo":{"deleteFlag":"Y"},"page":{"pageNum":"1","pageSize":"4"},"fieldName":"fileId","sort":"desc"}
	 * fieldName 执行需要排序的列;sort 指定升序还是降序(DESC降序,ASC升序);page 分页查询条件对象 pageNum 查询当前页，pageSize查出当前页面大小
	 * @return PageInfo<FileInfo> 
	 * 返回带有分页参数的对象,如果入参不带page对象,那么将会查询全部数据，且不带排序功能。当数据量很大的时候，会给前台带来严重的压力，请慎用
	 * {"pageNum":2,"pageSize":3,"size":3,"startRow":4,"endRow":6,"total":30165,"pages":10055,"list":[{"fileId":"5c50580d-9548-11e7-9334-00163e12ae01","originalFile":"ceshi14","filemd5":"2afsdfddas14","actualFileName":"2afsdfddas14.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000},{"fileId":"5c5b4e75-9548-11e7-9334-00163e12ae01","originalFile":"ceshi15","filemd5":"2afsdfddas15","actualFileName":"2afsdfddas15.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000},{"fileId":"5c6663b6-9548-11e7-9334-00163e12ae01","originalFile":"ceshi16","filemd5":"2afsdfddas16","actualFileName":"2afsdfddas16.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000}],"firstPage":1,"prePage":1,"nextPage":3,"lastPage":8,"isFirstPage":false,"isLastPage":false,"hasPreviousPage":true,"hasNextPage":true,"navigatePages":8,"navigatepageNums":[1,2,3,4,5,6,7,8]}
	 * @throws Exception 
	 */
	@RequestMapping(value = "queryList", method = RequestMethod.POST)
	public PageInfo<FileInfo> queryList(@RequestBody FileInfoConditon  fileInfoConditon) throws Exception{
		try {
			logger.info("FileInfoController>>>queryList>>>fileInfoConditon:" +JSON.toJSONString(fileInfoConditon));
			return fileInfoService.queryList(fileInfoConditon);
		} catch (Exception e) {
			logger.error("FileInfoController>>>queryList>>>error:" + e.getMessage());
			throw e;
		}
	}
	/**
	 * 根据主键全量更新整条数据
	 * @Title: updateByPrimaryKey   
	 * @Description: TODO  
	 * @param fileInfo {"actualFileName":"2afsdfddas19.xls","createTime":1504936602000,"creator":"KANGJIN.ZHAO","deleteFlag":"Y","fileId":"ac93f6e4-9523-11e7-9334-00163e12ae01","filemd5":"2afsdfddas19","originalFile":"ceshi19"}
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value="updateByPrimaryKey",method=RequestMethod.POST)
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
	/**
	 * 根据主键全量更新部分数据
	 * @Title: updateByPrimaryKeySelective   
	 * @Description: 根据主键局部更新某些字段 
	 * @param fileInfo 
	 * 例如
	 * {"actualFileName":"测试更新.xls","createTime":1504936602000,"fileId":"ac93f6e4-9523-11e7-9334-00163e12ae01","filemd5":"2afsdfddas19","originalFile":"的    端到端 "}
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value="updateByPrimaryKeySelective",method=RequestMethod.POST)
	public int updateByPrimaryKeySelective(@RequestBody FileInfo fileInfo){
		try {
			logger.info("FileInfoController>>>updateByPrimaryKeySelective>>>fileInfo:" +JSON.toJSONString(fileInfo));
			fileInfoService.updateByPrimaryKeySelective(fileInfo);
			return 1;
		} catch (Exception e) {
			logger.error("FileInfoController>>>updateByPrimaryKeySelective>>>error:" + e.getMessage());
			throw e;
		}
	}
	/**
	 * 
	 * @Title: updateBatch   
	 * @Description: TODO  
	 * @param fileInfoList
	 * 更新集合
	 * [{"fileId":"ac93f6e4-9523-11e7-9334-00163e12ae01","originalFile":"的    端到端 ","filemd5":"2afsdfddas19","actualFileName":"康进测试更新.xls","deleteFlag":"1","creator":"KANGJIN.ZHAO","createTime":1504936602000},{"fileId":"2","originalFile":"1","filemd5":"1","actualFileName":"1","deleteFlag":"1","creator":"1","createTime":1514736000000},{"fileId":"000f0761-94ab-11e7-9334-00163e12ae01","originalFile":"ceshi31544","filemd5":"2afsdfddas31544","actualFileName":"2afsdfddas31544.xls","deleteFlag":"1","creator":"KANGJIN.ZHAO","createTime":1504884773000},{"fileId":"000a178f-94ab-11e7-9334-00163e12ae01","originalFile":"ceshi31543","filemd5":"2afsdfddas31543","actualFileName":"2afsdfddas31543.xls","deleteFlag":"1","creator":"KANGJIN.ZHAO","createTime":1504884773000}]
	 * @return
	 */
	@RequestMapping(value="updateOrInsertBatch",method=RequestMethod.POST)
	public int updateOrInsertBatch(@RequestBody List<FileInfo> fileInfoList){
		try {
			logger.info("FileInfoController>>>updateBatch>>>fileInfo:" +JSON.toJSONString(fileInfoList));
			fileInfoService.updateList(fileInfoList);
			return fileInfoList.size();
		} catch (Exception e) {
			logger.error("FileInfoController>>>updateBatch>>>error:" + e.getMessage());
			throw e;
		}
	}
}
