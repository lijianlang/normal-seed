package cn.ljl.normalservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = {"cn.ljl.normalservice.mapper", "cn.ljl.baseservice.mapper"})
@ComponentScan(basePackages = {"cn.ljl.normalservice", "cn.ljl.baseservice"})
@EnableTransactionManagement
public class NormalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NormalServiceApplication.class, args);
	}
}
