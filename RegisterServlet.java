package com.example.servlet;

import com.example.dao.UserDao;
import com.example.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String firstname = req.getParameter("fisrtname");
    String lastname = req.getParameter("lastname");
    String username = req.getParameter("username");
    String email = req.getParameter("email");
    String password = req.getParameter("password");

    User user = new User();
    user.setFirstname(firstname);
    user.setLastname(lastname);
    user.setUsername(username);
    user.setEmail(email);
    user.setPassword(password);

    new UserDao().register(user);
    res.sendRedirect("Login.jsp");
}
}