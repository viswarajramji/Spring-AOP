package com.spring.aop.examples.afterreturn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class AfterReturnAspect {

	// Point cut declaration
	@Pointcut("execution(* com.spring.aop.examples.afterreturn.AfterReturnService.*(..))")
	private void allAfterService() {

	}

	@Pointcut("execution(* com.spring.aop.examples.afterreturn.AfterReturnService.getSample1())")
	private void getSample1() {

	}

	@Pointcut("execution(* com.spring.aop.examples.afterreturn.AfterReturnService.getSample2(..))")
	private void getSample2() {

	}

	@AfterReturning(pointcut = "getSample1()", returning = "result")
	public void logGetSample1(JoinPoint point, String result) {
		log.info("Sample1 was invoked " + result);
	}

	@AfterReturning(pointcut = "getSample2()", returning = "result")
	public void logGetSample2(JoinPoint point, String result) {
		log.info("Sample2 was invoked " + result);
	}

	@AfterReturning(pointcut = "allAfterService() && !getSample1() && !getSample2()", returning = "result")
	public void logGetSample3(JoinPoint point, String result) {
		log.info("Sample3 was invoked " + result);
	}

}
