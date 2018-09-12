package com.capgemini.bankapp.service.impl;

import com.capgemini.bankapp.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {

	@Override
	public double getBalance(long accountId) {
	
		return 0;
	}

	@Override
	public double withdraw(long accountId, double amount) {
	
		return 0;
	}

	@Override
	public double deposit(long accountId, double amount) {

		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) {
	
		return false;
	}

}
