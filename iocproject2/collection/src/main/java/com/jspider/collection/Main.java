package com.jspider.collection;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jspider/collection/jeeva.xml");
		Student s1=(Student) c1.getBean("xyz");
		System.out.println(s1);
		
		List<String> s2= s1.getSubjects();
		System.out.println(s2.getClass());

	}

}
