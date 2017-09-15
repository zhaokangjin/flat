package paas_portal;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;
import com.flat.paas.common.util.data.Page;
import com.flat.paas.common.util.date.DateUtil;
import com.flat.paas.portal.PaasPortalApp;
import com.flat.paas.portal.controller.MobileUserController;
import com.flat.paas.portal.domain.MobileUser;
import com.flat.paas.portal.domain.condition.MobileUserCondition;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringApplicationConfiguration(classes = PaasPortalApp.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class PaasPortalAppTest {
	@Resource
	private MobileUserController mobileUserController;
	@Test
	public void insert(){
		MobileUser mobileUser=new MobileUser();
		mobileUser.setCreateTime(new Date());
		mobileUser.setMobileappNickname("靖哥哥");
		mobileUser.setMobileappType(UUID.randomUUID().toString().substring(0, 12)+"&"+UUID.randomUUID().toString().substring(0, 8));
		mobileUser.setMobileappUserId(UUID.randomUUID().toString());
		mobileUser.setResourcesGroupId("weixin");
		mobileUser.setDeleteFlag("N");
		mobileUser.setEnableTime(new Date());
		mobileUser.setDisableTime(new Date());
		mobileUserController.insertMobileUser(mobileUser);
		
	}
	@Test
	public void getOne(){
		MobileUser mobileUser=new MobileUser();
		mobileUser.setMobileappUserId("af244111-7bce-45c4-8728-0a2ddae4ae3a");
		
		MobileUser reUser=mobileUserController.getMobileUser(mobileUser);
		System.err.println(JSON.toJSONString(reUser));
	}
	//{"page":{"pageNum":1,"pageSize":6},"fieldName":"createTime","sort":"DESC"}
	@Test
	public void getList(){
		MobileUser mobileUser=new MobileUser();
		MobileUserCondition mobileUserCondition=new MobileUserCondition();
		mobileUserCondition.setMobileUser(mobileUser);
		Page page=new Page();
		page.setPageNum(1);
		page.setPageSize(20);
		mobileUserCondition.setPage(page);
		mobileUserCondition.setFieldName("createTime");
		mobileUserCondition.setSort("DESC");
		PageInfo<MobileUser> pagelist=mobileUserController.queryList(mobileUserCondition);
		for(int i=0;i<pagelist.getList().size();i++){
			System.err.println(DateUtil.dateToString(pagelist.getList().get(i).getCreateTime(),"yyyy-MM-dd HH:mm:ss"));
		}
		
		
	}
}
