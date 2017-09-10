package paas_file;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.flat.paas.file.PaasFileApp;
import com.flat.paas.file.controller.FileInfoController;
import com.flat.paas.file.controller.FileRegistryController;
import com.flat.paas.file.domain.FileInfo;
import com.flat.paas.file.domain.FileRegistry;
import com.flat.paas.file.domain.condition.FileInfoConditon;
import com.github.pagehelper.PageInfo;
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringApplicationConfiguration(classes = PaasFileApp.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class FileRegistryTest {
	@Resource
	FileRegistryController fileRegistryController;
	@Resource
	FileInfoController fileInfoController;
	
	@Test
	public void insertOne(){
		FileRegistry fileRegistry=new FileRegistry();
		fileRegistry.setCreateTime(new Date());
		fileRegistry.setCreator("kangjin.zhao@accenture");
		fileRegistry.setDeleteFlag("N");
		String md5=UUID.randomUUID().toString().substring(0, 32);
		fileRegistry.setFilemd5(md5);
		fileRegistry.setFileSize("5M");
		fileRegistry.setFilePath("image/office");
		FileInfo fileInfo=null;
		List<FileInfo> list=new ArrayList<FileInfo>();
		for(int i=0;i<5;i++){
			fileInfo=new FileInfo();
			fileInfo.setActualFileName("测试注册文件服务"+i);
			fileInfo.setCreateTime(new Date());
			fileInfo.setCreator("kangjin.zhao@accenture");
			fileInfo.setDeleteFlag("N");
			fileInfo.setFilemd5(md5);
			fileInfo.setOriginalFile("原文件名是这样的吗"+i);
			list.add(fileInfo);
		}
		fileRegistry.setFileInfoList(list);
		fileRegistry.setRerCount(1);
		fileRegistryController.insert(fileRegistry);
		fileInfoController.insertBatch(list);
	}
	@Test
	public void insertBatch(){
		List<FileRegistry> listFileRegistry=new ArrayList<FileRegistry>();
		FileRegistry fileRegistry=null;
		FileInfo fileInfo=null;
		List<FileInfo> list=null;
		for(int i=0;i<30;i++){
			fileRegistry=new FileRegistry();
			fileRegistry.setCreateTime(new Date());
			fileRegistry.setCreator("kangjin.zhao@accenture");
			fileRegistry.setDeleteFlag("N");
			String md5=UUID.randomUUID().toString().substring(0, 32);
			fileRegistry.setFilemd5(md5);
			fileRegistry.setFileSize("5M");
			fileRegistry.setFilePath("image/office");
			listFileRegistry.add(fileRegistry);
			list=new ArrayList<FileInfo>();
			for(int j=0;j<30;j++){
				fileInfo=new FileInfo();
				fileInfo.setActualFileName("测试注册文件服务"+i*j);
				fileInfo.setCreateTime(new Date());
				fileInfo.setCreator("kangjin.zhao@accenture");
				fileInfo.setDeleteFlag("N");
				fileInfo.setFilemd5(md5);
				fileInfo.setOriginalFile("原文件名是这样的吗"+i*j);
				list.add(fileInfo);
			}
		}
		fileRegistryController.insertBatch(listFileRegistry);
		fileInfoController.insertBatch(list);
	}
	@Test
	public void selectOne(){
		String fileMd5="7febf904-71f3-41b1-82c8-b8fc049c";
		FileRegistry fileRegistry=new FileRegistry();
		fileRegistry.setFilemd5(fileMd5);
		fileRegistry=fileRegistryController.selectByPrimaryKey(fileRegistry);
		FileInfoConditon fileInfoConditon=new FileInfoConditon();
		FileInfo fileInfo=new FileInfo();
		fileInfo.setFilemd5(fileRegistry.getFilemd5());
		fileInfoConditon.setFileInfo(fileInfo);
		try {
			PageInfo<FileInfo> fileInfoList=fileInfoController.queryList(fileInfoConditon);
			fileRegistry.setFileInfoList(fileInfoList.getList());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(fileRegistry);
		
	}
}
