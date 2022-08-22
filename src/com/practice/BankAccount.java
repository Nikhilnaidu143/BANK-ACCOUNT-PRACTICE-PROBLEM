package com.practice;

public class BankAccount {

	private String nameOfDepositor;
	private String accountNumber;
	private String addressOfDepositor;
	private String typeOfAccount;
	private Double balanceInAccount;
	private Integer numberOfTransactions;

	public BankAccount() {
	}

	public BankAccount(String nameOfDepositor, String accountNumber, String addressOfDepositor, String typeOfAccount,
			Double balanceInAccount, Integer numberOfTransactions) {
		this.nameOfDepositor = nameOfDepositor;
		this.accountNumber = accountNumber;
		this.addressOfDepositor = addressOfDepositor;
		this.typeOfAccount = typeOfAccount;
		this.balanceInAccount = balanceInAccount;
		this.numberOfTransactions = numberOfTransactions;
	}

	public String getNameOfDepositor() {
		return nameOfDepositor;
	}

	public void setNameOfDepositor(String nameOfDepositor) {
		this.nameOfDepositor = nameOfDepositor;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddressOfDepositor() {
		return addressOfDepositor;
	}

	public void setAddressOfDepositor(String addressOfDepositor) {
		this.addressOfDepositor = addressOfDepositor;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	public Double getBalanceInAccount() {
		return balanceInAccount;
	}

	public void setBalanceInAccount(Double balanceInAccount) {
		this.balanceInAccount = balanceInAccount;
	}

	public Integer getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Integer numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	@Override
	public String toString() {
		return "BankAccount{\n" + "   Name Of Depositor : " + nameOfDepositor + "\n" + "   Account Number : " + accountNumber
				+ "\n" + "   Address Of Depositor : " + addressOfDepositor + "\n" + "   Type Of Account : " + typeOfAccount
				+ "\n" + "   Balance In Account : " + balanceInAccount + "\n" + "   Number Of Transactions : "
				+ numberOfTransactions + "\n" + "}";
	}
}
