package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public Boolean addSillyMember() {
		
		System.out.println(getClass()+ ": Adding membership account :");
		
		return true;
	}
	
public void goToSleep() {
		
		System.out.println(getClass()+ ": Going to sleep:");
		
	}
}
