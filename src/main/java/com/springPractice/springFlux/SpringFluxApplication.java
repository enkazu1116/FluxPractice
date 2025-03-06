package com.springPractice.springFlux;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springPractice.springFlux.Mapper")
public class SpringFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFluxApplication.class, args);
	}

}
