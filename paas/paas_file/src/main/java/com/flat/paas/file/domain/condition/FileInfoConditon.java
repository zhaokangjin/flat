package com.flat.paas.file.domain.condition;

import com.flat.paas.file.domain.FileInfo;

public class FileInfoConditon extends BaseCondition{

	// 查询过滤条件
	private FileInfo FileInfo;

	public FileInfo getFileInfo() {
		return FileInfo;
	}
	public void setFileInfo(FileInfo fileInfo) {
		FileInfo = fileInfo;
	}
}
