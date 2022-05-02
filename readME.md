# Spring AOP - Aspect-oriented programming

In this repo, you will find details about spring aspect-oriented programming.


## Spring AOP

Spring is used to implement cross cutting logic.

Uses proxy design pattern.

Supports only run-time weaving.

#####Note: In-case if your looking for more flexibility in using aspect use AspectJ. Spring AOP is a subset of AspectJ.

## AOP Terms

1. Aspect: Implementation of cross cutting logic.
2. Advice: Define when the cross cutting implementation should be executed (i,e) lifecyle . Refer to advice type section for more details.
3. Pointcut: predicate expression.
4. JoinPoint: details about method signature and arguments.

##AOP - Advice Type 

* @Before : logic gets executed before method.
* @AfterReturning : logic gets executed only after successful execution of the method.
* @AfterThrowing: logic gets executed when an exception is thrown. (Exception can only be intercepted but not allowed to be modified).
* @After: logic gets executed after completion of the method despited success or failure.
* @Around: logic gets executed both during method start and end. However this type offers a handler to execute the actual method.

##AOP - Enabling AOP.

* Include the following dependency as part of maven.

		<dependency>
			<groupId>org.aspectj</groupId>
			<artifactId>aspectjweaver</artifactId>
		</dependency>

* Include the following annotation. @EnableAspectJAutoProxy in Spring root file.

* Provide Component Scan details for scanning the aspects Ex: @ComponentScan("com.spring.aop.examples")

##AOP Pattern Syntax

modifier(?) return-type fully-qualified-class-name(?) methodName ( method-arguments ) exception(?) 

Note: 

	? is optional.
	* is a wildcard for any pattern match


###  Method-arguments pattern

The following parameters can be used to match the patterns.

	(..) -> 0 or n arguments.
	(*)  -> exactly 1.
	()   -> no arguments. 







