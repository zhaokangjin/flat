package com.flat.paas.file.domain.condition;

import com.flat.paas.file.domain.FileRegistry;
/**
 * @ClassName: FileRegistryConditon   
 * @Description: TODO  
 * @author: kangjin.zhao  
 * @date:2017年9月10日 上午11:54:45
 */
public class FileRegistryConditon extends BaseCondition {
	private static final long serialVersionUID = 9007800318422345981L;
	private FileRegistry fileRegistry;

	public FileRegistry getFileRegistry() {
		return fileRegistry;
	}

	public void setFileRegistry(FileRegistry fileRegistry) {
		this.fileRegistry = fileRegistry;
	}
}
