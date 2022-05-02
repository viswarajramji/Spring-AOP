package com.spring.aop.examples.after;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/after")
public class AfterController {

	@Autowired
	public AfterService afterService;

	@GetMapping("/sample1")
	public String getSample1() {
		return afterService.getSample1();
	}

	@GetMapping("/sample2/{value}")
	public String getSample2(@PathVariable("value") String value) {
		return afterService.getSample2(value);
	}

	@GetMapping("/sample3")
	public String getSample3() {
		return afterService.getSample3();
	}

}
