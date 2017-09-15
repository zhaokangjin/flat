package com.flat.paas.portal.service;

import com.flat.paas.portal.domain.MobileUser;
import com.flat.paas.portal.domain.condition.MobileUserCondition;
import com.github.pagehelper.PageInfo;

public interface MobileUserService {
	public void insert(MobileUser mobileUser);
	public MobileUser getMobileUser(String id);
	public PageInfo<MobileUser> queryList(MobileUserCondition mobileUserCondition);
}
