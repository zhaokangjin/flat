package com.flat.paas.portal;

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
@ComponentScan(basePackages={"com.flat.paas.portal"})
@MapperScan("com.flat.paas.portal.persistence")
public class PaasPortalApp {
	private final static Logger log = LoggerFactory.getLogger(PaasPortalApp.class);
	/**   
	 * @Title: main   
	 * @Description: TODO  格式要求，无实际作用
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("PaaS通用包已加载...");
		SpringApplication.run(PaasPortalApp.class, args);
	}
}
