package com.killer.dao;

import java.sql.*;

import com.killer.model.Users;

public class RegisterDao {
	public void insertDataUsers(Users u) {
		Connection con = null;
		PreparedStatement ps = null;
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String user = "root";
		String password = "Killer0786";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement("insert into userdetails (uname, umail, upassword,uage, ugender) values(?,?,?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getMail());
			ps.setString(3, u.getPassword());
			ps.setInt(4, u.getAge());
			ps.setString(5, u.getGender());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
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
