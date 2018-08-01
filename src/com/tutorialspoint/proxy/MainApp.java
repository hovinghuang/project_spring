package com.tutorialspoint.proxy;

public class MainApp {
	public static void main(String[] args) {
		JDKProxyDemo jdkProxyDemo = new JDKProxyDemo();
		Hello bind = ((Hello) jdkProxyDemo.bind(new HelloImpl()));
		bind.say();
	}
}