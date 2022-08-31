package com.jsp.constractor_collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/constractor_collection/jee.xml");
	    // Ipl s1=(Ipl) c1.getBean("abc");
	     System.out.println(c1.getBean("abc"));
		//System.out.println(c1.getBean(""));
	

	}

}
