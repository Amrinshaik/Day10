package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displaydetails")
public class CreditCard extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreditCard() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		String name=request.getParameter("EmployeeName");
		String mobile=request.getParameter("MobileNumber");
		String cardNumber=request.getParameter("Card Number");
		String date=request.getParameter("Expiry Date");
		String cvv=request.getParameter("CVV");
		out.println("<h3>Employee Name: "+name+ "</h3><h3>Mobile Number: "+mobile+ "</h3><h3>Card Number: "+cardNumber+"</h3><h3>Expiry Date: "+date+"</h3><h3>CVV: "+cvv+"</h3>");
		out.println("<h3><a href='creditCard.html'>Next User</a></h3>");
	}

}
