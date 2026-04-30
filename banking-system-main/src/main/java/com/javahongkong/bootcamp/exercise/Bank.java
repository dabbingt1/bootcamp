package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference
	private Long accountCount = 1L;

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber);
	}

        @Override
	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long newAccountNumber = accountCount++;
		CommercialAccount newAccount = new CommercialAccount(company, newAccountNumber, pin, startingDeposit);
		accounts.put(newAccountNumber, newAccount);
		return newAccountNumber;
	}
	@Override
	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Long newAccountNumber = accountCount++;
		ConsumerAccount newAccount = new ConsumerAccount(person, newAccountNumber, pin, startingDeposit);
		accounts.put(newAccountNumber, newAccount);
		return newAccountNumber;
	}

		
		public boolean authenticateUser(Long accountNumber, int pin) {
			// complete the function
        Account account = accounts.get(accountNumber);
        return account != null && account.validatePin(pin);
}
	

	public double getBalance(Long accountNumber) {
		// complete the function
		 Account account = accounts.get(accountNumber);
		 if (account == null) {
			return -1.0;
		 }
		 return account.getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		 Account account = accounts.get(accountNumber);
		 if (account != null) {
			account.creditAccount(amount);
		 }
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		Account account = accounts.get(accountNumber);
		if (account != null) {
			return account.debitAccount(accountNumber);
		} 
		return false;
	}
}
