package com.spring.aop.examples.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class BeforeAspect {

	// Point cut declaration
	@Pointcut("execution(* com.spring.aop.examples.before.BeforeService.*(..))")
	private void allBeforeService() {

	}

	@Pointcut("execution(* com.spring.aop.examples.before.BeforeService.getBeforeSampleData())")
	private void beforeSampleData() {

	}

	@Pointcut("execution(* com.spring.aop.examples.before.BeforeService.getBeforeSampleDataWithParams(..))")
	private void beforeSampleDataWithParams() {

	}

	@Before("beforeSampleData()")
	public void logGetBeforeSampleData() {
		log.info("GetBeforeSampleData was invoked");
	}

	@Before("beforeSampleDataWithParams()")
	public void logGetBeforeSampleDataWithParams(JoinPoint joinPoint) {
		log.info("GetBeforeSampleDataWithParams was invoked");
		for (Object arg : joinPoint.getArgs()) {
			log.info("parameter : " + arg);
		}
	}

	@Before("!beforeSampleData() && !beforeSampleDataWithParams() && allBeforeService()")
	public void logOthers() {
		log.info("BeforeService was invoked");
	}

}
