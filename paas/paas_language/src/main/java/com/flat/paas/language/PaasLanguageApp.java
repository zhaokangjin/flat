package com.flat.paas.language;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@EnableTransactionManagement
//@EnableCaching
@ComponentScan(basePackages={"com.flat.paas.language"})
@MapperScan("com.flat.paas.language.persistence")
public class PaasLanguageApp {
	private final static Logger logger = LoggerFactory.getLogger(PaasLanguageApp.class);
	/**   
	 * @Title: main   
	 * @Description: TODO  格式要求，无实际作用
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("paas_language正在启动");
		SpringApplication.run(PaasLanguageApp.class, args);
	}
}
