package com.tutorialspoint.annotation003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//@Autowired可以不用写get和set方法
//xml对Student初始化了两个值不一样的bean，
//@Qualifier("student1")用于标明注入student1
public class Profile {
	@Autowired
	@Qualifier("student1")
	private Student student;

	public Profile() {
		System.out.println("Inside Profile constructor.");
	}

	public void printAge() {
		System.out.println("Age : " + student.getAge());
	}

	public void printName() {
		System.out.println("Name : " + student.getName());
	}
}