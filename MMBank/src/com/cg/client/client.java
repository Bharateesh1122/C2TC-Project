package com.cg.client;
import com.cg.application.*;

import com.cg.framework.*;

public class client {
	
	
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(123,"bharateesh",20000,true);
		CurrentAcc ca = new MMCurrentAcc(456,"bharat",10000,1000);
		sa.deposit(sa.getAccountBalance());
		ca.deposit(ca.getAccountBalance());
		sa.toString();
		System.out.println(sa);
		ca.toString();
		System.out.println(ca);
		
	}

}
