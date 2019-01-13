package cn.ljl.normalservice;

import cn.ljl.normalservice.entity.TbUserInfo;
import cn.ljl.normalservice.service.ITbUserInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NormalServiceApplicationTests {



	@Autowired
	private ITbUserInfoService userInfoService;

	@Test
	public void contextLoads() {
		QueryWrapper<TbUserInfo> wrapper = new QueryWrapper<>();
		wrapper.eq("username", "lijianlang");
		List<TbUserInfo> userInfoList = userInfoService.list(wrapper);
		System.out.println(userInfoList);
	}

}
