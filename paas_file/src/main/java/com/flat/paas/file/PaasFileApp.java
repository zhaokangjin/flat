package com.flat.paas.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
/**
 * @ClassName: PaasFileApp   
 * @Description: TODO  
 * @author: kangjin.zhao  
 * @date:2017年9月6日 下午12:07:09
 */
public class PaasFileApp {
	private final static Logger logger = LoggerFactory.getLogger(PaasFileApp.class);
	/**
	 * @Title: main   
	 * @Description: TODO  
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("PaasFileApp通用包已加载");
		new SpringApplicationBuilder(PaasFileApp.class).web(true).run(args);
	}
}
