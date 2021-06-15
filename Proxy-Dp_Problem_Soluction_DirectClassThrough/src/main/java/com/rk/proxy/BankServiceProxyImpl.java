package com.rk.proxy;

import com.rk.comp.BankServiceImpl;
import com.rk.comp.IBankService;

public class BankServiceProxyImpl implements IBankService {
    
	private IBankService real;
    
	public BankServiceProxyImpl() {
		real=new BankServiceImpl();
	}
	
	public String withdraw(long acno, double amount) {
		String msg=null;
		 if(amount<=4000)
			 msg=real.withdraw(acno, amount);
		 else {
			 msg=real.withdraw(acno,4000);
			 msg=msg+"(*** Only max of 4000 can be withdraw at a time During transition period ****)";
		 }
		return msg;
	}

}//class
