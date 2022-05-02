package com.spring.aop.examples.around;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/around")
public class AroundController {

	@Autowired
	public AroundService aroundService;

	@GetMapping("/sample1")
	public String getSample1() {
		return aroundService.getSample1();
	}

}
