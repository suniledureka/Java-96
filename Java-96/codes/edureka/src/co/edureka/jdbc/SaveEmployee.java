package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
				
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101, 'Sanjay', 2500.75)";
		
		try {
			int rowsAffected = st.executeUpdate(sql);
			System.out.println("Employees Saved - " + rowsAffected);
		}catch(Exception ex) {
			System.err.println("ERROR: " + ex.toString());
		}
		
		st.close();
		con.close();
	}
}
