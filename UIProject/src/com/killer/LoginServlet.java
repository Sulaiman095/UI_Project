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


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//doGet(request, response);
		String mail = req.getParameter("useremail");
		String pass = req.getParameter("userpassword");
		
		LoginDao ld = new LoginDao();
		
		if(ld.loginValidate(mail, pass)) {
			HttpSession session = req.getSession();
			session.setAttribute("username", mail);
			res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}
	}

}
