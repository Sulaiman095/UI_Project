package com.killer.dao;

import java.sql.*;


public class LoginDao {

	public boolean loginValidate(String mail, String pass) {
		Connection con = null;
		PreparedStatement ps = null;
		String url = "jdbc:mysql://localhost:3306/j2ee";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "Killer0786");
			ps = con.prepareStatement("select * from userdetails where umail=? and upassword=?");
			ps.setString(1, mail);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String password = rs.getString("upassword");
				if (pass.equals(password)) {
					return true;
				}
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
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
