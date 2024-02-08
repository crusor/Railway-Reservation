package ReservationApplication;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingsDAO {

	public int getBookedCount(int TrainNo,Date date) throws SQLException {
		String query="select  count (passenger_name) from booking where train_no=? and travel_date=?";
		Connection con = Dbconnection.getconnection();
		PreparedStatement pst =con.prepareStatement(query);
		  java.sql.Date sqldate= new java.sql.Date(date.getTime()); 
		pst.setInt(1, TrainNo);
		pst.setDate(2, sqldate);
		ResultSet rs= pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

	public void addBooking(Bookings booking)throws SQLException {
	  String query = "insert into booking values(?,?,?)";
	   Connection con =Dbconnection.getconnection();	
		  java.sql.Date sqldate= new java.sql.Date(booking.date.getTime()); 

	   PreparedStatement pst =con.prepareStatement(query);
		pst.setString(1, booking.passengername);
        pst.setInt(2, booking.TrainNo);
        pst.setDate(3, sqldate);
        pst.executeUpdate();
	}

}
 