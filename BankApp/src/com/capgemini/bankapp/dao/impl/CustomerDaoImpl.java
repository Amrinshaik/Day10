package com.capgemini.bankapp.dao.impl;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

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
