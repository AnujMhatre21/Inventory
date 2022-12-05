package com.theatre;

public class Theatre {
		private String name;
		private Ticket ticket;
		
		public Theatre(String name) {
			this.name=name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Ticket getTicket() {
			return ticket;
		}

		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}
		
		public void bookTicket(int n) {
			if(n!=0 && n<=ticket.getSeat_availability()) {
				int a=ticket.getSeat_availability();
				int res=a-n;
				ticket.setSeat_availability(res);
			System.out.println("No of tickets booked  "+n+"Seats available  "+ticket.getSeat_availability());
			}else {
				System.out.println("Not booked");
			}
		}
		
		public void cancelTicket(int n) {
			if(n!=0) {
				int a=ticket.getSeat_availability();
				int res=a+n;
				ticket.setSeat_availability(res);
				System.out.println("Bookin Cancelled and available tickets  "+ticket.getSeat_availability());
			}else {
				System.out.println("Not Cancelled");
			}
		}
		
		public void checkSeats() {
			System.out.println("Ticket available are "+ticket.getSeat_availability());
		}
}
