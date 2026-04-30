package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder= accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		return this.pin == attemptedPin;
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return this.pin;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
		BigDecimal amountBD = BigDecimal.valueOf(amount);
		BigDecimal currentBalance = BigDecimal.valueOf(this.balance);

		this.balance = currentBalance.add(amountBD).doubleValue();
	}

	public boolean debitAccount(double amount) {
		// complete the function
		BigDecimal amountBD = BigDecimal.valueOf(amount);
		BigDecimal currentBalance = BigDecimal.valueOf(this.balance);

		if (currentBalance.compareTo(amountBD) >= 0) {
			this.balance = currentBalance.subtract(amountBD).doubleValue();
			return true;
		}
		return false;
	}
}
