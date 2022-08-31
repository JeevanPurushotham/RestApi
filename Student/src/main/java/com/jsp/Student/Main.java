package com.jsp.Student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/Student/NewFile.xml");
		College col=(College)c1.getBean("college_object1");
		System.out.println(col);
	}

}
