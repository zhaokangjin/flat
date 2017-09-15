package com.flat.paas.portal.domain.condition;

import com.flat.paas.common.util.data.Page;
import com.flat.paas.portal.domain.MobileUser;

public class MobileUserCondition {
	//{"page":{"pageNum":1,"pageSize":6},"fieldName":"createTime","sort":"DESC"}
	private MobileUser mobileUser;
	private Page page;
	private String fieldName;
	private String sort;

	public MobileUser getMobileUser() {
		return mobileUser;
	}

	public void setMobileUser(MobileUser mobileUser) {
		this.mobileUser = mobileUser;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getSort() {
		return sort;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
}
