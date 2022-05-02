package com.spring.aop.examples.afterthrow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afterthrowing")
public class AfterThrowingController {

	@Autowired
	public AfterThrowingService afterReturnService;

	@GetMapping("/sample1")
	public String getSample1() {
		return afterReturnService.getSample1();
	}

}
