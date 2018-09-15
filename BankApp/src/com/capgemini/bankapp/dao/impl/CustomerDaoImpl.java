package com.capgemini.bankapp.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.database.Database;
import com.capgemini.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	Set<Customer> customers = Database.getCustomer();
	@Override
	public Customer authenticate(Customer customer) {
		for (Customer c : customers) {
			if ((c.getEmail().equals(customer.getEmail())) && (c.getPassword().equals(customer.getPassword()))) {
				
					return c;
				}
			}
		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {
		for (Customer c : customers) {
			if (c.getEmail().equals(customer.getEmail())) {
				if(c.getPassword().equals(customer.getPassword())) {
				c.setCustomerName(customer.getCustomerName());
				c.setCustomerId(customer.getCustomerId());
				c.setAddress(customer.getAddress());
				c.setEmail(customer.getEmail());
				c.setAccount(customer.getAccount());
				c.setDateOfBirth(customer.getDateOfBirth());
				return c;
			}
			
		}
		}
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
		for (Customer c :customers) {
			if (c.getPassword() == oldPassword) {
				c.setPassword("newPassword");
			}
			return true;
		}
		return false;
	}

	@Override
public HashSet<Customer> findAllCustomers(){
		return null;
	}
}
	
