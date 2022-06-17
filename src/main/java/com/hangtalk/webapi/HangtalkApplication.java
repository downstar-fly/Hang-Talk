package com.hangtalk.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.hangtalk.webapi.filter")
public class HangtalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HangtalkApplication.class, args);
	}

}
