package co.edureka.except;

import java.sql.SQLException;

public class UserServices {
	public String findEmailByUserId(int id) throws SQLException {
		System.out.println("logic to get userid from DB");
		return "sunil@edureka.co";
	}
}