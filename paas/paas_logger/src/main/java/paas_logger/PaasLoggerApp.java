package paas_logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaasLoggerApp {
	private final static Logger log = LoggerFactory.getLogger(PaasLoggerApp.class);
	/**   
	 * @Title: main   
	 * @Description: TODO  格式要求，无实际作用
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("PaaS通用包已加载...");
	}
}
