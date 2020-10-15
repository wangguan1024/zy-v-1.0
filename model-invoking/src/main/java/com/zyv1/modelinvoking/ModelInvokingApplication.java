package com.zyv1.modelinvoking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ModelInvokingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelInvokingApplication.class, args);
	}

}
