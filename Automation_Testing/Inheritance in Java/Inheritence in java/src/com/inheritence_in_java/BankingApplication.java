package com.inheritence_in_java;

class Account{
	String accountHolder ="Aman Singh";
	double balance=100000;
	public void deposit(double amount) {
		balance =balance+amount;
		System.out.println("amount deposited:"+amount);
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("amount withdraw"+amount);
	}
	public void displayBalance() {
		System.out.println("current balance:"+balance);
	}
}
class SavingAccount extends Account{
	public void calculateInterest() {
		double interest=balance*5/100;
		System.out.println("Interset Earned:"+interest);
	}
}
public 
public class BankingApplication {

}
