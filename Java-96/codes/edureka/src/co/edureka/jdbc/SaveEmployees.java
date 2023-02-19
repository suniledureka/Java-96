package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp(empno,ename,sal) values(102,'Praveen', 3500), (103,'Charan', 4500)," +
					"(104,'Markus', 2789), (105, 'Sachin', 8750.50)";
		
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
