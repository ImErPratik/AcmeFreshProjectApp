package com.AcmeFresh.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;




@SpringBootApplication
@EnableSwagger2
public class AcmeFreshAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcmeFreshAppApplication.class, args);
	}

}
