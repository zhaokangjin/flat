package com.flat.paas.file;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * @ClassName: PaasFileApp   
 * @Description: TODO  
 * @author: kangjin.zhao  
 * @date:2017年9月6日 下午9:12:58
 */
@SpringBootApplication
@EnableTransactionManagement
//@EnableCaching
@ComponentScan(basePackages={"com.flat.paas.file"})
@MapperScan("com.flat.paas.file.persistence")
public class PaasFileApp {
	private final static Logger logger = LoggerFactory.getLogger(PaasFileApp.class);
	/**   
	 * @Title: main   
	 * @Description: 文件服务器启动
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("PaasFileApp通用包已加载...");
		SpringApplication.run(PaasFileApp.class, args);
	}
}
