package com.qn.wechat;

import com.qn.wechat.dao.SysConfigDao;
import com.qn.wechat.dao.entity.SysConfig;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SysConfigTest {

	@Autowired
	SysConfigDao sysConfigDao;
	@Test
	public void contextLoads() {
		SysConfig sysConfig = new SysConfig();
		sysConfig.setCode("9999");
		sysConfig.setValueText("测测9-更新过的");
		sysConfigDao.saveAndFlush(sysConfig);

	}


	public void testFindByCode(){
		List<SysConfig> lst = sysConfigDao.selectByCode("9999");

	}

}
