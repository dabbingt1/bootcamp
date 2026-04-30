package com.javahongkong.bootcamp.exercise;

public class ConsumerAccount extends Account {

	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		super(person, accountNumber, pin, currentBalance);
	}
		
		
	    public AccountHolder accountHolder() {
		return super.getAccountHolder();
	}

		
		public double balance() {
			return super.getBalance();
		}

}