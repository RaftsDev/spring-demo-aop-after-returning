package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	
    public List<Account> findAccounts(){
	
	  List<Account> myAccounts = new ArrayList<>();
	  
	  Account temp1 = new Account("John","Silver");
	  Account temp2 = new Account("Madhu","Platinum");
	  Account temp3 = new Account("Luca","Gold");
	  
	  myAccounts.add(temp1);
	  myAccounts.add(temp2);
	  myAccounts.add(temp3);
	
	  return myAccounts;
    }

	public void addAccount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + ": Doing my DB work: adding my account");
	}

	public void doWork() {

		System.out.println(getClass() + ": Do work method:");
	}

	
	
	public String getName() {
		System.out.println(getClass() + ": Do getName method:");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": Do setName method:");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": Do getServiceCode method:");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": Do setServiceCode method:");
		this.serviceCode = serviceCode;
	}

}
