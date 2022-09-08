package com.jsp.interface_injection; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
      ApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/interface_injection/NewFile1.xml");
      Customer c2=c1.getBean(Customer.class);  //customer name should be smaller
     System.out.println(c2);
      Account a1=c2.getAccount();
      a1.deposit();
      a1.withdraw();
      
      Account a2=c2.getAccount1();
      a2.deposit();
      a2.withdraw();
	}
}
