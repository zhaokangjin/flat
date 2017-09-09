package com.flat.paas.file.domain.condition;

import com.flat.paas.file.domain.FileInfo;

public class FileInfoConditon{
	private Page page;
	private FileInfo FileInfo;
	

	public Page getPage() {
		return page;
	}
	public void setPage(Page  page) {
		this.page = page;
	}
	public FileInfo getFileInfo() {
		return FileInfo;
	}
	public void setFileInfo(FileInfo fileInfo) {
		FileInfo = fileInfo;
	}

}
