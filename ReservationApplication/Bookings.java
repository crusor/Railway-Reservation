package ReservationApplication;

import java.text.ParseException;

import java.sql.SQLException;
import java.text.SimpleDateFormat;


import java.util.*;

public class Bookings {
	String passengername;
	int TrainNo; 
	Date date;
	Bookings(){
		
		try (Scanner s2 = new Scanner(System.in)) {
			System.out.println("enter the passenser name:");
			passengername=s2.next();
			System.out.println("enter the train no");
			 TrainNo=s2.nextInt();
			 System.out.println("enter the date  :dd-mm-yyyy");
			 String dateinput=s2.next();
			  SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
 try {
date=  d.parse(dateinput);
} catch (ParseException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
		}
	}
	public boolean isAvailable() throws SQLException {
	TrainDAO trail=new TrainDAO();
	BookingsDAO bookingsdao=new BookingsDAO();
		int capacity=trail.getcapacity(TrainNo);
	int booked=bookingsdao.getBookedCount(TrainNo,date);
	
		return booked<capacity?true:false;
		
	}

}
