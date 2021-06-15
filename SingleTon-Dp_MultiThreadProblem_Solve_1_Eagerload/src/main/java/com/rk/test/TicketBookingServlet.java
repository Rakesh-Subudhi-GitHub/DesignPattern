package com.rk.test;

import com.rk.sdp.Printer;

public class TicketBookingServlet implements Runnable {

public void run() {
	
	Printer p= Printer.getInstaceMethod();
	
	System.out.println("hashcode is: "+p.hashCode());
}

}//class
