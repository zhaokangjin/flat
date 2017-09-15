package com.flat.paas.portal.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.flat.paas.common.util.bean.BeanUtils;
import com.flat.paas.portal.domain.MobileUser;
import com.flat.paas.portal.domain.condition.MobileUserCondition;
import com.flat.paas.portal.persistence.MobileUserMapper;
import com.flat.paas.portal.service.MobileUserService;
import com.github.pagehelper.PageInfo;

@Service
public class MobileUserServiceImpl implements MobileUserService {
	@Resource
	MobileUserMapper mobileUserMapper;
	@Override
	public void insert(MobileUser mobileUser){
		mobileUserMapper.insert(mobileUser);
	}
	@Override
	public MobileUser getMobileUser(String id){
		return mobileUserMapper.selectByPrimaryKey(id);
	}
	@Override
	public PageInfo<MobileUser> queryList(MobileUserCondition mobileUserCondition) {
		BeanUtils.setPageByCondition(mobileUserCondition);
		List<MobileUser> mobileUserList=mobileUserMapper.queryList(mobileUserCondition.getMobileUser());
		PageInfo<MobileUser> pageData = new PageInfo<MobileUser>(mobileUserList);
		return pageData;
	}
}
