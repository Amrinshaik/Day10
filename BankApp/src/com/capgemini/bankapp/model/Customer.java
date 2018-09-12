package com.capgemini.bankapp.model;

public class Customer {
	private long customerId;
	private String customerName;
	private String password;
	private String email;
	private String address;
	private String dateOfBirth;
	private String accountType;

	public Customer() {
		super();

	}

	public Customer(long customerId, String customerName, String password, String email, String address,
			String dateOfBirth, String account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.accountType = account;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAccount() {
		return accountType;
	}

	public void setAccount(String account) {
		this.accountType = account;
	}

}
