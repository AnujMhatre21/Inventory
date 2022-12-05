package ticket;

public class ticket {
	String name;
	int seat_avai = 50;

	ticket(String name) {
		this.name = name;
	}

	public void printTicketDetails() {
		System.out.println(name);
		System.out.println(seat_avai);
	}

}
