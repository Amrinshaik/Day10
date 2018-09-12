package com.capgemini.bankapp.service.impl;

import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer authenticate(Customer customer) {

		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {

		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
	
		return false;
	}

}
