package com.killer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public boolean loginValidate(String mail, String pass) {
		Connection con = null;
		Statement s = null;
		String url = "jdbc:mysql://localhost:3306/j2ee";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "Killer0786");
			s = con.createStatement();
			s.executeUpdate("use j2ee");
			ResultSet rs = s
					.executeQuery("select * from userdetails where umail='" + mail + "' and upassword='" + pass + "'");
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null) {
					s.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return false;
	}
}
