import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import webapp.model.User;
import webapp.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class TestMybatis {
	private static Logger logger=Logger.getLogger(TestMybatis.class);
	@Resource
	private UserMapper userMapper;
	@Test
	public void test1(){
		User user=userMapper.selectByPrimaryKey(1);
		//在控制台打印User的信息
		logger.info(JSON.toJSONString(user));
	}
}
