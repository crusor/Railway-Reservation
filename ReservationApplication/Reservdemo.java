package ReservationApplication;

import java.sql.SQLException;


import java.util.Scanner;

public class Reservdemo {
public static void main(String[] args) throws SQLException {
		
		TrainDAO traindao= new TrainDAO();
		traindao.dispalytraininfo();
				int useropt=1;	
     Scanner sc= new Scanner(System.in);

 while(useropt==1){
System.out.println("enter 1 to book and 2 to exit");
useropt=sc.nextInt();
if(useropt==1) {
	Bookings booking  =new Bookings();
	if(booking.isAvailable()) {
		 BookingsDAO bookingdao = new BookingsDAO();
		 bookingdao.addBooking(booking);
		System.out.println("your booking is comfirmed");
	}
	else {
		System.out.println("bookings not available");
	}
	
}
 sc.close();
}
	}

}
