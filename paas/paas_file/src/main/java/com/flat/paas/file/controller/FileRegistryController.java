package com.flat.paas.file.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
//import com.flat.paas.file.domain.FileInfo;
import com.flat.paas.file.domain.FileRegistry;
import com.flat.paas.file.domain.condition.FileRegistryConditon;
import com.flat.paas.file.service.FileInfoService;
import com.flat.paas.file.service.FileRegistryService;
import com.github.pagehelper.PageInfo;

import oracle.net.aso.e;

public class FileRegistryController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	FileInfoService fileInfoService;
	@Resource
	FileRegistryService fileRegistryService;
	/**
	 * 新增单条记录
	 * 
	 * @Title: insert
	 * @Description: TODO
	 * @param record
	 *            {"originalFile":"我的个爷端
	 *            ","filemd5":"2afsdfddas19","actualFileName":"康进测试新增.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO"}
	 * @return String "051cd8ed-95cd-11e7-9334-00163e12ae01"
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(@RequestBody FileRegistry record) {
		try {
			logger.info("FileRegistryController>>>insert>>>record:" + JSON.toJSONString(record));
			record.setCreateTime(new Date());
			fileRegistryService.insert(record);
			return record.getFilemd5();
		} catch (Exception e) {
			logger.error("FileRegistryController>>>insert>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 批量插入记录
	 * 
	 * @Title: insertBatch
	 * @Description: 批量插入记录，返回插入后的结果
	 * @param record
	 *            [{"fileId":"aa28b1d7-6fc1-449d-9ffe-884ea0c09df5","originalFile":"我的个爷端
	 *            ","filemd5":"2afsdfddas19","actualFileName":"康进测试新增0.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1505009563195},{"fileId":"22c4d950-1838-4e95-abaf-a59f1bb6988b","originalFile":"我的个爷端
	 *            ","filemd5":"2afsdfddas19","actualFileName":"康进测试新增1.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1505009563197},{"fileId":"69d2f565-9543-4503-8f32-3f18978d5a92","originalFile":"我的个爷端
	 *            ","filemd5":"2afsdfddas19","actualFileName":"康进测试新增2.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1505009563197}]
	 * @return [{"fileId":"aa28b1d7-6fc1-449d-9ffe-884ea0c09df5","originalFile":"我的个爷端
	 *         ","filemd5":"2afsdfddas19","actualFileName":"康进测试新增0.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1505009563195},{"fileId":"22c4d950-1838-4e95-abaf-a59f1bb6988b","originalFile":"我的个爷端
	 *         ","filemd5":"2afsdfddas19","actualFileName":"康进测试新增1.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1505009563197},{"fileId":"69d2f565-9543-4503-8f32-3f18978d5a92","originalFile":"我的个爷端
	 *         ","filemd5":"2afsdfddas19","actualFileName":"康进测试新增2.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1505009563197}]
	 */
	@RequestMapping(value = "insertBatch", method = RequestMethod.POST)
	public List<FileRegistry> insertBatch(@RequestBody List<FileRegistry> record) {
		try {
			logger.info("FileRegistryController>>>insertBatch>>>record:" + JSON.toJSONString(record));
			for (int i = 0; i < record.size(); i++) {
				record.get(i).setCreateTime(new Date());
			}
			fileRegistryService.insertBatch(record);
			return record;
		} catch (Exception e) {
			logger.error("FileRegistryController>>>insertBatch>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 物理删除指定主键的记录
	 * 
	 * @Title: deleteByPrimaryKey
	 * @Description: 删除指定主键的记录
	 * @param record
	 *            {"fileId":"aa28b1d7-6fc1-449d-9ffe-884ea0c09df5"}
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value = "deleteByPrimaryKey", method = RequestMethod.POST)
	public int deleteByPrimaryKey(@RequestBody FileRegistry record) {
		try {
			logger.info("FileRegistryController>>>deleteByPrimaryKey>>>record:" + JSON.toJSONString(record));
			fileRegistryService.deleteByPrimaryKey(record.getFilemd5());
			return 1;
		} catch (Exception e) {
			logger.error("FileRegistryController>>>deleteByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 依据主键修改删除标记
	 * 
	 * @Title: deleteByPrimaryKeySoft
	 * @Description: 依据主键修改删除标记
	 * @param record
	 *            {"fileId":"22c4d950-1838-4e95-abaf-a59f1bb6988b"}
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value = "deleteByPrimaryKeySoft", method = RequestMethod.POST)
	public int deleteByPrimaryKeySoft(@RequestBody FileRegistry record) {
		try {
			logger.info("FileRegistryController>>>deleteByPrimaryKeySoft>>>record:" + JSON.toJSONString(record));
			fileRegistryService.deleteByPrimaryKeySoft(record.getFilemd5());
			return 1;
		} catch (Exception e) {
			logger.error("FileRegistryController>>>deleteByPrimaryKeySoft>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 依据主键，批量物理删除记录
	 * @Title: deleteList
	 * @Description: 依据主键，批量物理删除记录
	 * @param record
	 * [{"fileId":"aa28b1d7-6fc1-449d-9ffe-884ea0c09df5"},{"fileId":"22c4d950-1838-4e95-abaf-a59f1bb6988b"},{"fileId":"69d2f565-9543-4503-8f32-3f18978d5a92"}]
	 * @return 1
	 * @exception
	 */
	@RequestMapping(value = "deleteList", method = RequestMethod.POST)
	public int deleteList(@RequestBody List<FileRegistry> record) {
		try {
			logger.info("FileRegistryController>>>deleteList>>>record:" + JSON.toJSONString(record));
			fileRegistryService.deleteList(record);
			return 1;
		} catch (Exception e) {
			logger.error("FileRegistryController>>>deleteList>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 批量软删除
	 * @Title: deleteListSoft
	 * @Description: 批量软删除
	 * @param record
	 * [{"fileId":"aa28b1d7-6fc1-449d-9ffe-884ea0c09df5"},{"fileId":"22c4d950-1838-4e95-abaf-a59f1bb6988b"},{"fileId":"69d2f565-9543-4503-8f32-3f18978d5a92"}]
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value = "deleteListSoft", method = RequestMethod.POST)
	public int deleteListSoft(@RequestBody List<FileRegistry> fileInfoList) {
		try {
			logger.info("FileRegistryController>>>deleteListSoft>>>deleteListSoft:" + JSON.toJSONString(fileInfoList));
			fileRegistryService.deleteListSoft(fileInfoList);
			return 1;
		} catch (Exception e) {
			logger.error("FileRegistryController>>>deleteListSoft>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 根据主键全量更新整条数据
	 * @Title: updateByPrimaryKey
	 * @Description: TODO
	 * @param record
	 * {"actualFileName":"2afsdfddas19.xls","createTime":1504936602000,"creator":"KANGJIN.ZHAO","deleteFlag":"Y","fileId":"ac93f6e4-9523-11e7-9334-00163e12ae01","filemd5":"2afsdfddas19","originalFile":"ceshi19"}
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value = "updateByPrimaryKey", method = RequestMethod.POST)
	public int updateByPrimaryKey(@RequestBody FileRegistry fileInfo) {
		try {
			logger.info("FileRegistryController>>>updateByPrimaryKey>>>record:" + JSON.toJSONString(fileInfo));
			fileRegistryService.updateByPrimaryKey(fileInfo);
			return 1;
		} catch (Exception e) {
			logger.error("FileRegistryController>>>updateByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 根据主键全量更新部分数据
	 * 
	 * @Title: updateByPrimaryKeySelective
	 * @Description: 根据主键局部更新某些字段
	 * @param record
	 * 例如
	 * {"actualFileName":"测试更新.xls","createTime":1504936602000,"fileId":"ac93f6e4-9523-11e7-9334-00163e12ae01","filemd5":"2afsdfddas19","originalFile":"的端到端 "}
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective", method = RequestMethod.POST)
	public int updateByPrimaryKeySelective(@RequestBody FileRegistry record) {
		try {
			logger.info("FileRegistryController>>>updateByPrimaryKeySelective>>>record:" + JSON.toJSONString(record));
			fileRegistryService.updateByPrimaryKeySelective(record);
			return 1;
		} catch (Exception e) {
			logger.error("FileRegistryController>>>updateByPrimaryKeySelective>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 对于前台传入的集合，可能是新增，可能是删除，可能是更新，那么此接口会批量执行此动作，以达到最佳执行效率
	 * @Title: updateBatch
	 * @Description: 【新增】与【更新 与删除（软删除）】 是根据主键来区别的
	 * @param record 更新集合
	 * [{"fileId":"ac93f6e4-9523-11e7-9334-00163e12ae01","originalFile":"的端到端","filemd5":"2afsdfddas19","actualFileName":"康进测试更新.xls","deleteFlag":"1","creator":"KANGJIN.ZHAO","createTime":1504936602000},{"fileId":"2","originalFile":"1","filemd5":"1","actualFileName":"1","deleteFlag":"1","creator":"1","createTime":1514736000000},{"fileId":"000f0761-94ab-11e7-9334-00163e12ae01","originalFile":"ceshi31544","filemd5":"2afsdfddas31544","actualFileName":"2afsdfddas31544.xls","deleteFlag":"1","creator":"KANGJIN.ZHAO","createTime":1504884773000},{"fileId":"000a178f-94ab-11e7-9334-00163e12ae01","originalFile":"ceshi31543","filemd5":"2afsdfddas31543","actualFileName":"2afsdfddas31543.xls","deleteFlag":"1","creator":"KANGJIN.ZHAO","createTime":1504884773000}]
	 * @return 1
	 * @exception e
	 */
	@RequestMapping(value = "updateOrInsertBatch", method = RequestMethod.POST)
	public int updateOrInsertBatch(@RequestBody List<FileRegistry> record) {
		try {
			logger.info("FileRegistryController>>>updateOrInsertBatch>>>record:" + JSON.toJSONString(record));
			fileRegistryService.updateList(record);
			return record.size();
		} catch (Exception e) {
			logger.error("FileRegistryController>>>updateOrInsertBatch>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 根据映射文件ID查询真实文件的基本信息
	 * @Title: selectByPrimaryKey
	 * @Description: 一个相同的文件可能被多个人引用或共享，可以用此信息查询文件的基本信息
	 * @param record
	 * 例如：{"fileId":"000a178f-94ab-11e7-9334-00163e12ae01"}
	 * @return FileInfo fileInfo 例如：
	 * {"fileId":"000a178f-94ab-11e7-9334-00163e12ae01","originalFile":"ceshi31543","filemd5":"2afsdfddas31543","actualFileName":"2afsdfddas31543.xls","deleteFlag":"Y","creator":"KANGJIN.ZHAO","createTime":1504884773000}
	 * @exception e
	 */
	@RequestMapping(value = "selectByPrimaryKey", method = RequestMethod.POST)
	public FileRegistry selectByPrimaryKey(@RequestBody FileRegistry record) {
		logger.info("FileRegistryController>>>selectByPrimaryKey>>>record:" + JSON.toJSONString(record));
		try {
			return fileRegistryService.selectByPrimaryKey(record.getFilemd5());
		} catch (Exception e) {
			logger.error("FileRegistryController>>>selectByPrimaryKey>>>error:" + e.getMessage());
			throw e;
		}
	}

	/**
	 * 分页查询接口
	 * @Title: queryList
	 * @Description: 规范：所有需要分页查询的接口,条件对象必须继承page对象，前台参数必须给定。需要按指定字段排序的，必须给出该字段对应的属性以及升序还是降序规则
	 * @param recordConditon
	 *  例如:
	 * {"fileInfo":{"deleteFlag":"Y"},"page":{"pageNum":"1","pageSize":"4"},"fieldName":"fileId","sort":"desc"}
	 *  【注意：】fieldName 执行需要排序的列;sort 指定升序还是降序(DESC降序,ASC升序);page 分页查询条件对象 pageNum 查询当前页，pageSize查出当前页面大小
	 * @return PageInfo<FileInfo>
	 * {"pageNum":2,"pageSize":3,"size":3,"startRow":4,"endRow":6,"total":30165,"pages":10055,"list":[{"fileId":"5c50580d-9548-11e7-9334-00163e12ae01","originalFile":"ceshi14","filemd5":"2afsdfddas14","actualFileName":"2afsdfddas14.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000},{"fileId":"5c5b4e75-9548-11e7-9334-00163e12ae01","originalFile":"ceshi15","filemd5":"2afsdfddas15","actualFileName":"2afsdfddas15.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000},{"fileId":"5c6663b6-9548-11e7-9334-00163e12ae01","originalFile":"ceshi16","filemd5":"2afsdfddas16","actualFileName":"2afsdfddas16.xls","deleteFlag":"N","creator":"KANGJIN.ZHAO","createTime":1504952358000}],"firstPage":1,"prePage":1,"nextPage":3,"lastPage":8,"isFirstPage":false,"isLastPage":false,"hasPreviousPage":true,"hasNextPage":true,"navigatePages":8,"navigatepageNums":[1,2,3,4,5,6,7,8]}
	 * 返回带有分页参数的对象,如果入参不带page对象,那么将会查询全部数据，且不带排序功能。当数据量很大的时候，会给前台带来严重的压力，请慎用
	 * @throws Exception 
	 */
	@RequestMapping(value = "queryList", method = RequestMethod.POST)
	public PageInfo<FileRegistry> queryList(@RequestBody FileRegistryConditon recordConditon) throws Exception {
		try {
			logger.info("FileRegistryController>>>queryList>>>recordConditon:" + JSON.toJSONString(recordConditon));
			return fileRegistryService.queryList(recordConditon);
		} catch (Exception e) {
			logger.error("FileRegistryController>>>queryList>>>error:" + e.getMessage());
			throw e;
		}
	}
}
