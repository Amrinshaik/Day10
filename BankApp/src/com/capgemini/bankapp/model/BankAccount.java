package com.capgemini.bankapp.model;

public class BankAccount {
	private long accountId;
	private String accountType;
	private long balance;

	public BankAccount() {
		super();

	}

	public BankAccount(long accountId, String accountType, long balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
