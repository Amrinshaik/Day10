package com.capgemini.bankapp.dao;

import java.util.HashSet;

import com.capgemini.bankapp.model.Customer;

public interface CustomerDao {
	HashSet<Customer> findAllCustomers();
	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword);
	


}
