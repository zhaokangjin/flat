package com.flat.paas.portal.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flat.paas.portal.domain.MobileUser;
import com.flat.paas.portal.domain.condition.MobileUserCondition;
import com.flat.paas.portal.service.MobileUserService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("mobileUser")
public class MobileUserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	MobileUserService mobileUserService;

	@RequestMapping(value="insert",method=RequestMethod.POST)
	public int insertMobileUser(@RequestBody MobileUser mobileUser) {
		logger.info("MobileUserController>>>insertMobileUser>>>mobileUser:"+mobileUser);
		try {
			mobileUserService.insert(mobileUser);
			return 1;
		} catch (Exception e) {
			throw e;
		}
	}

	@RequestMapping(value="selectByPrimaryKey",method=RequestMethod.POST)
	public MobileUser getMobileUser(@RequestBody MobileUser mobileUser) {
		logger.info("MobileUserController>>>queryList>>>mobileUser:"+mobileUser);
		try {
			return mobileUserService.getMobileUser(mobileUser.getMobileappUserId());
		} catch (Exception e) {
			throw e;
		}
	}
	@RequestMapping(value="queryList",method=RequestMethod.POST)
	public PageInfo<MobileUser> queryList(MobileUserCondition mobileUserCondition){
		logger.info("MobileUserController>>>queryList>>>mobileUserCondition:"+mobileUserCondition);
		try {
			return mobileUserService.queryList(mobileUserCondition);
		} catch (Exception e) {
			throw e;
		}
	}
}
