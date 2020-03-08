package com.killer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.killer.dao.LoginDao;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail = request.getParameter("useremail");
		String pass = request.getParameter("userpassword");

		LoginDao ld = new LoginDao();

		if (ld.loginValidate(mail, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", mail);
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
