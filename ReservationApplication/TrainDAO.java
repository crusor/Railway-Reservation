package ReservationApplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainDAO {

	public void dispalytraininfo() throws SQLException {
		String query="select*from train ";
Connection con = Dbconnection.getconnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.println("Coach No:"+rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.println("Ac:no");
			}
			else {
			System.out.println("Ac:yes");	
			}
			System.out.println("capacity:"+rs.getInt(3));
			
		}
		System.out.println("-----------------------------");
	}

	public int getcapacity(int id) throws SQLException {
		String query="select capacity from  train where id="+id;
		 Connection con=Dbconnection.getconnection();
		 Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			return rs.getInt(1);
			
	}

}
  