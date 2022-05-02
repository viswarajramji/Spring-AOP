package com.spring.aop.examples.after;

import org.springframework.stereotype.Component;

@Component
public class AfterService {

	public String getSample1() {
		return "after-hello world";
	}

	public String getSample2(String value) {
		return "after- hello world-" + value;
	}

	public String getSample3() {
		return "after-test-access";
	}

}
