package com.killer.dao;

import java.sql.*;

import com.killer.model.Users;

public class RegisterDao {
	public void insertDataUsers(Users u) {
		Connection con = null;
		Statement s = null;
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String user = "root";
		String password = "Killer0786";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			s = con.createStatement();
			s.executeUpdate("use j2ee");
			s.executeUpdate("insert into userdetails (uname, umail, upassword,uage, ugender)" + "values('" + u.getName()
					+ "'," + "'" + u.getMail() + "'," + "'" + u.getPassword() + "'," + "'" + u.getAge() + "'," + "'"
					+ u.getGender() + "')");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
