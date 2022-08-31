package com.jsp.interface_injection;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("saving withdraw");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println(" saving deposit");
	}

}
