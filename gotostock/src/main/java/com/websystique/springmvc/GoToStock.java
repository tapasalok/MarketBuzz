package com.websystique.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.websystique.springmvc.configuration.JpaConfiguration;




@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.websystique.springmvc"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class GoToStock {

	public static void main(String[] args) {
		SpringApplication.run(GoToStock.class, args);
	}
}
