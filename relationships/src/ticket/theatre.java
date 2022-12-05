package ticket;

public class theatre {
	String name;
	ticket Ticket;

	theatre(String name) {
		this.name = name;
	}

	public void bookTicket() {
		System.out.println(name);
		System.out.println(Ticket.name);
		System.out.println(Ticket.seat_avai);
	}

}
