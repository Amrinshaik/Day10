package com.capgemini.bankapp.service.impl;

import java.util.Set;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.database.Database;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {

	private BankAccountDao bankAccountDao = new BankAccountDaoImpl();
	Set<BankAccount> bankAccounts = Database.getBankAccount();

	@Override
	public double getBalance(long accountId) {
		return bankAccountDao.getBalance(accountId);
	}

	@Override
	public double withdraw(long accountId, double amount) {
		double newBalance;
		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getBalance() - amount >= 0) {
				newBalance = bankAccount.getBalance() - amount;
				if (bankAccountDao.updateBalance(accountId, newBalance))
					bankAccount.setBalance(newBalance);
				Database.setBankAccount(bankAccounts);
				return newBalance;
			}
		}
		return 0;
	}

	@Override
	public double deposit(long accountId, double amount) {
		double newBalance;
		for (BankAccount bankAccount : bankAccounts) {
			newBalance = bankAccount.getBalance() + amount;
			if (bankAccountDao.updateBalance(accountId, newBalance))
				bankAccount.setBalance(newBalance);
			Database.setBankAccount(bankAccounts);
			return newBalance;
		}
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) {

		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountId() == toAcc) {
				if (withdraw(fromAcc, amount) == 0)
					return false;
				if (bankAccount.getAccountId() == toAcc) {
					deposit(toAcc, amount);
					return true;
				}
			}
		}
		return false;
	}
}
