package com.tutorialspoint.annotation001;

import org.springframework.beans.factory.annotation.Required;

//@Required，用于检查一个Bean的属性的值在配置期间是否被赋值
public class Student {
	private Integer age;
	private String name;

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}