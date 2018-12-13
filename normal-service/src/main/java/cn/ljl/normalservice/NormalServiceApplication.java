package cn.ljl.normalservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"cn.ljl.normalservice.mapper"})
@ComponentScan(basePackages = {"cn.ljl.normalservice"})
public class NormalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NormalServiceApplication.class, args);
	}
}
