package com.spring.aop.examples.afterreturn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afterreturn")
public class AfterReturnController {

	@Autowired
	public AfterReturnService afterReturnService;

	@GetMapping("/sample1")
	public String getSample1() {
		return afterReturnService.getSample1();
	}

	@GetMapping("/sample2/{value}")
	public String getSample2(@PathVariable("value") String value) {
		return afterReturnService.getSample2(value);
	}

	@GetMapping("/sample3")
	public String getSample3() {
		return afterReturnService.getSample3();
	}

}
