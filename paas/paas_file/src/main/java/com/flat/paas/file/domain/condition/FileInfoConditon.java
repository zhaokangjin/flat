package com.flat.paas.file.domain.condition;

import com.flat.paas.common.util.data.BaseCondition;
import com.flat.paas.file.domain.FileInfo;

public class FileInfoConditon extends BaseCondition{
	private static final long serialVersionUID = 2712650963027124747L;
	// 查询过滤条件
	private FileInfo FileInfo;

	public FileInfo getFileInfo() {
		return FileInfo;
	}
	public void setFileInfo(FileInfo fileInfo) {
		FileInfo = fileInfo;
	}
}
