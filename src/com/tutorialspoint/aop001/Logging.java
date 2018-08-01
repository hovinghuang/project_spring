package com.tutorialspoint.aop001;

public class Logging {

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