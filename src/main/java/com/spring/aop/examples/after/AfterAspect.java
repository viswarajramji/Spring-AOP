package com.spring.aop.examples.after;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class AfterAspect {

	// Point cut declaration
	@Pointcut("execution(* com.spring.aop.examples.after.AfterService.*(..))")
	private void allAfterService() {

	}

	@Pointcut("execution(* com.spring.aop.examples.after.AfterService.getSample1())")
	private void getSample1() {

	}

	@Pointcut("execution(* com.spring.aop.examples.after.AfterService.getSample2(..))")
	private void getSample2() {

	}

	@After("getSample1()")
	public void logGetSample1() {
		log.info("Sample1 was invoked");
	}

	@After("getSample2()")
	public void logGetSample2() {
		log.info("Sample2 was invoked");
	}

	@After("allAfterService() && !getSample1() && !getSample2()")
	public void logGetSample3() {
		log.info("Sample3 was invoked");
	}

}
