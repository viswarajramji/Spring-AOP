package com.spring.aop.examples.around;

import org.springframework.stereotype.Component;

@Component
public class AroundService {

	public String getSample1() {
		return "around-hello world";
	}

}
