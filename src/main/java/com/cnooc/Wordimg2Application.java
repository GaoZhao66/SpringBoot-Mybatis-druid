package com.cnooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cnooc.dao")
public class Wordimg2Application {

	public static void main(String[] args) {
		SpringApplication.run(Wordimg2Application.class, args);
	}
}
