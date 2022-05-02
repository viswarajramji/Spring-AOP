package com.spring.aop.examples.afterthrow;

import org.springframework.stereotype.Component;

@Component
public class AfterThrowingService {

	public String getSample1() {
		throw new RuntimeException("hello world");
	}

}
