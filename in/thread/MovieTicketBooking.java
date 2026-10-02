package in.thread;

public class MovieTicketBooking {

	int avilableTickets = 100;

	public void run() {
		if (avilableTickets > 0) {
			// logic to bookTicket;
			--avilableTickets;
		}
	}

	public static void main(String[] args) {
		
			Thread t1 = new Thread();
			Thread t2 = new Thread();
			Thread t20 = new Thread();

			//t1..... t20 ---start
	}
}
