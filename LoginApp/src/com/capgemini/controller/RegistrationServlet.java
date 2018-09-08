package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;   //obj reference variable 
	
	//HashMap to store user details as we don't have a database (instance variable)
	private HashMap<String, String> users=new HashMap<>();
       
   

	public RegistrationServlet() {
        super();
    }
	
	 @Override
	    public void init(ServletConfig config) throws ServletException{
	    	context=config.getServletContext();
	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
	    if(users.containsKey(username)) {
	    	out.println("<h3>User exists.Please enter another username</h3>");
	    	out.println("<a href='registration.html'>Try Again</a>");
	    }
	    else {
	    	users.put(username, password); //adds username and password to the map
	    	out.println("<h3>Registration Successful.</h3>");
		    out.println("<br></br><a href='login.html'>Login Here</a>");
		    context.setAttribute("usersData", users); //adds map to the context object
	}

		out.close();

}
}
