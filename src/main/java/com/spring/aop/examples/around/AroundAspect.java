package com.spring.aop.examples.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class AroundAspect {

	// Point cut declaration

	@Pointcut("execution(* com.spring.aop.examples.around.AroundService.getSample1())")
	private void getSample1() {

	}

	@Around("getSample1()")
	public Object logGetSample1(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("Sample1 was invoked");
		Object result = joinPoint.proceed();
		log.info("Sample1 was Completed");
		return result;
	}

}
