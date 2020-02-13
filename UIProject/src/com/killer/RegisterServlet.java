package com.killer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.killer.dao.RegisterDao;
import com.killer.model.Users;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//doGet(request, response);
		//PrintWriter out = res.getWriter();
		String name = req.getParameter("username");
		String mail = req.getParameter("useremail");
		String pass = req.getParameter("userpassword");
		int age = Integer.parseInt(req.getParameter("userage"));
		String gender = req.getParameter("usergender");
		
		Users ud = new Users(name, mail, pass, age, gender);
		RegisterDao rd = new RegisterDao();
		rd.insertDataUsers(ud);
		// Redirecting to login page
		RequestDispatcher dis = req.getRequestDispatcher("login.jsp");
		dis.forward(req, res);
		
		
	}

}
