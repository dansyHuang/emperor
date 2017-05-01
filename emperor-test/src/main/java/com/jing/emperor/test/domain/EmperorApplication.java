package com.jing.emperor.test.domain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages={"com.jing.emperor.domain"//,"com.jing.emperor.domain"
		})
@MapperScan("com.jing.emperor.domain.mapper")
public class EmperorApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EmperorApplication.class, args);
	}
}
