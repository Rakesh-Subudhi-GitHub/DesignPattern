package com.rk.test;

public class TicketBooking_MultiThread {

	public static void main(String[] args) {
		
		//create thread to booked ticket
		TicketBookingServlet ticket=new TicketBookingServlet();
		
		Thread t1=new Thread(ticket);
		Thread t2=new Thread(ticket);
		Thread t3=new Thread(ticket);
		
		//call the Thread
		t1.start();
		t2.start();
		t3.start();
		
	}//main
}//class
