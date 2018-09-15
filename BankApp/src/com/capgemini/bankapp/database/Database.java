package com.capgemini.bankapp.database;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;

public class Database {
	public static Set<BankAccount> bankAccount = new HashSet<>();
	public static Set<Customer> customer = new HashSet<>();

	public Database() {
		super();
	}
	static{
		BankAccount a1 = new BankAccount(111, "savings", 28000.00);
		BankAccount a2 = new BankAccount(222, "current", 25000.00);
		BankAccount a3 = new BankAccount(333, "savings", 30000.00);
		BankAccount a4 = new BankAccount(444, "savings", 20000.00);

		bankAccount.add(a1);
		bankAccount.add(a2);
		bankAccount.add(a3);
		bankAccount.add(a4);
		

		Customer c1=new Customer(123, "Amrin", "xyz", "amrin@gmail.com", "ou colony", LocalDate.of(1997, 01, 29),a1);
		Customer c2=new Customer(124, "Priyanka", "yz", "priyanka@gmail.com", "sv colony", LocalDate.of(1996, 06, 6),a2);
		Customer c3=new Customer(125, "KC", "z", "KC@gmail.com", "gv colony", LocalDate.of(1996, 03, 17),a3);
		Customer c4=new Customer(126, "Keerthana", "wxyz", "keerthi@gmail.com", "kv colony",LocalDate.of(1997, 02, 17),a4);
		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
	}
	public static Set<BankAccount> getBankAccount() {
		return bankAccount;
	}
	public static void setBankAccount(Set<BankAccount> bankAccount) {
		Database.bankAccount = bankAccount;
	}
	public static Set<Customer> getCustomer() {
		return customer;
	}
	public static void setCustomer(Set<Customer> customer) {
		Database.customer = customer;
	}


}