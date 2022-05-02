package com.spring.aop.examples.afterthrow;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class AfterThrowingAspect {

	// Point cut declaration
	@Pointcut("execution(* com.spring.aop.examples.afterthrow.*.*(..))")
	private void allAfterThrowing() {

	}

	@AfterThrowing(pointcut = "allAfterThrowing()", throwing = "exception")
	public void logGetSample1(JoinPoint point, Throwable exception) {
		log.info("Sample1 was invoked " + exception.getMessage());
	}

}
