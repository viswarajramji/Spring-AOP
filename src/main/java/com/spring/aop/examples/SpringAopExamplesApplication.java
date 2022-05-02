package com.spring.aop.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.spring.aop.examples")
@SpringBootApplication
public class SpringAopExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopExamplesApplication.class, args);
	}

}
