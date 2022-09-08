package com.jsp.interface_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component        //used to create the object for class

public class Customer {  //component class
    @Value("111")    //value @ used to initiation the primitive data
	private int Customer_id;
    @Value("jeevan") 
	private String Customername;
    @Value("9663730470") 
	private long phono;
    @Autowired       //it is used to identify the reference dependencies
    @Qualifier("current")   //it is used to store the address of implementation class's object(up casting)   --->here saving name should be smaller 
	private Account account;
    
    @Autowired
    @Qualifier("savings")
    private Account account1;

	public int getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public long getPhono() {
		return phono;
	}

	public void setPhono(long phono) {
		this.phono = phono;
	}

	public Account getAccount() {
		return account;
	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}

	public Account getAccount1() {
		return account1;
	}

//	public void setAccount1(Account account1) {
//		this.account1 = account1;
//	}

	@Override
	public String toString() {
		return "Customer [Customer_id=" + Customer_id + ", Customername=" + Customername + ", phono=" + phono
				+ ", account=" + account + ", account1=" + account1 + "]";
	}
	
}
