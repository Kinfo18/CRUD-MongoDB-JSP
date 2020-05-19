package com.jcg.mongodb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// This method is called by the servlet container to process a 'post' request
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		handleRequest(req, resp);
	}

	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		// Reading post parameters from the request
		String param1 = req.getParameter("login_nit"), 
				param2 = req.getParameter("login_nombre"),
                                param3 = req.getParameter("login_direccion"),
                                param4 = req.getParameter("login_contacto");

		// Checking for null and empty values
		if(param1 == null || param2 == null || param3 == null || param4 == null ||"".equals(param1) || "".equals(param2) || "".equals(param3) || "".equals(param4)) {
			req.setAttribute("error_message", "Intente nuevamente.");
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		} else {

			boolean isUserFound = Util.searchUserInDb(param1, param2, param3, param4);
			if(isUserFound) {				
				req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
			} else {
				req.setAttribute("error_message", "No se pudo hacer el registro.");
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}	
		}		
	}
}