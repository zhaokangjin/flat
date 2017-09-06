package com.flat.paas.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
/**
 * @ClassName: PaasRedisApp   
 * @Description: TODO  
 * @author: kangjin.zhao  
 * @date:2017年9月6日 下午12:10:23
 */
public class PaasRedisApp {
	private final static Logger logger = LoggerFactory.getLogger(PaasRedisApp.class);
	/**
	 * @Title: main   
	 * @Description: TODO  
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("PaasFileApp通用包已加载");
		new SpringApplicationBuilder(PaasRedisApp.class).web(true).run(args);
	}
}
