package com.spring.aop.examples.before;

import org.springframework.stereotype.Component;

@Component
public class BeforeService {

	public String getBeforeSampleData() {
		return "before-hello world";
	}

	public String getBeforeSampleDataWithParams(String value) {
		return "before- hello world-" + value;
	}

	public String access() {
		return "before-test-access";
	}

}
