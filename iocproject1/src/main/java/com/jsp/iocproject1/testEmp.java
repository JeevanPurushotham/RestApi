package com.jsp.iocproject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.iocproject1.Employee;

public class testEmp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/iocproject1/empconfig.xml");
		Employee e1 = (Employee)c1.getBean("jeeva");
		System.out.println(e1);

	}

}
