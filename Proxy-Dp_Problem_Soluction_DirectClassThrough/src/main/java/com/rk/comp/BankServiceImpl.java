package com.rk.comp;

public class BankServiceImpl implements IBankService {

	public String withdraw(long acno, double amount) {
		return "withdrawing amount ::"+amount+" from account number::"+acno;
	}

}//class
