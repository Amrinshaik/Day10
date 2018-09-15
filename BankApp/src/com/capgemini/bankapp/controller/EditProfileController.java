package com.capgemini.bankapp.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.CustomerService;
import com.capgemini.bankapp.service.impl.CustomerServiceImpl;

@WebServlet("/editProfile")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerService customerService;

	public EditProfileController() {
		super();
		customerService = new CustomerServiceImpl();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession session = request.getSession();
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String dateOfBirth = request.getParameter("dateOfBirth");
		LocalDate dob = LocalDate.parse(dateOfBirth);
		RequestDispatcher dispatcher = null;
		Customer customer = new Customer(customerId, customerName, password, email, address, dob, null);
		customerService.updateProfile(customer);
		if (customer.getEmail() != null) {
			dispatcher = request.getRequestDispatcher("profileeditsuccess.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}
}