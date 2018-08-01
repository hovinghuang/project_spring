package com.tutorialspoint.aop002;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	@Pointcut("execution(* com.tutorialspoint.aop002.*.*(..))")
	private void selectAll() {
	}

	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("[beforeAdvice]");
	}

	public void afterAdvice() {
		System.out.println("[afterAdvice]");
	}

	public void afterReturningAdvice(Object retVal) {
		System.out.println("[afterReturningAdvice:]" + retVal.toString());
	}

	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("[There has been an exception:] " + ex.toString());
	}

}