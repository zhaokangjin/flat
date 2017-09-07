package paas_file;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.flat.paas.file.PaasFileApp;
import com.flat.paas.file.controller.FileInfoController;
import com.flat.paas.file.domain.FileInfo;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringApplicationConfiguration(classes = PaasFileApp.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class PaasFileAppTest {
	@Resource
	FileInfoController fileInfoController;

	@Test
	public void insert() {
		FileInfo fileInfo=new FileInfo();
		fileInfo.setOriginalFile("ceshi");
		fileInfo.setFilemd5("2afsdfddas");
		fileInfo.setActualFileName("2afsdfddas.xls");
		fileInfoController.insert(fileInfo);
		System.err.println(fileInfo.getFileId());
	}
}
