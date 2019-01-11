package cn.ljl.normalservice;

import cn.ljl.normalservice.mapper.ProductMapper;
import cn.ljl.normalservice.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NormalServiceApplicationTests {

	@Autowired
	private ProductMapper productMapper;

	@Test
	public void contextLoads() {

	}

}
