package com.capgemini.bankapp.dao.impl;

import java.util.Set;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.database.Database;
import com.capgemini.bankapp.model.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao {
	Set<BankAccount> bankAccount = Database.getBankAccount();

	@Override
	public double getBalance(long accountId) {
		for (BankAccount bankAccount : bankAccount) {
			if (bankAccount.getAccountId() == accountId) {
				return bankAccount.getBalance();
			}
		}
		return 0;
	}

	@Override
	public boolean updateBalance(long accountId, double newBalance) {
		for (BankAccount bankAccount : bankAccount) {
			if (bankAccount.getAccountId() == accountId) {
				bankAccount.setBalance(newBalance);
				return true;
			}
		}
		return false;
	}
}
