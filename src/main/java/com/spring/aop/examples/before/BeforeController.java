package com.spring.aop.examples.before;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/before")
public class BeforeController {

	@Autowired
	public BeforeService beforeService;

	@GetMapping("/sample1")
	public String getSample1() {
		return beforeService.getBeforeSampleData();
	}

	@GetMapping("/sample2/{value}")
	public String getSample2(@PathVariable("value") String value) {
		return beforeService.getBeforeSampleDataWithParams(value);
	}

	@GetMapping("/sample3")
	public String getSample3() {
		return beforeService.access();
	}

}
