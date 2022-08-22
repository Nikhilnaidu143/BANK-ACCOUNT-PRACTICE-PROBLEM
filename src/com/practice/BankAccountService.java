package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountService {

	public static List<BankAccount> listOfBankAccounts = new ArrayList<>();
	public static Scanner input = new Scanner(System.in);

	public void addBankAccount() {
		System.out.print("Enter name of depositor : ");
		String name = input.next();
		System.out.print("\nEnter address of depositor : ");
		String address = input.next();
		System.out.print("\nEnter type of account : ");
		String accountType = input.next();
		System.out.print("\nEnter balance in account : ");
		Double balanceInAccount = input.nextDouble();

		BankAccount bankAccount = new BankAccount();

		int accountNumber = 1000;
		if (listOfBankAccounts.size() == 0) {
			bankAccount.setAccountNumber("BA" + accountNumber);
		} else {
			bankAccount.setAccountNumber("BA" + (accountNumber + listOfBankAccounts.size()));
		}

		bankAccount.setNameOfDepositor(name);
		bankAccount.setAddressOfDepositor(address);
		bankAccount.setTypeOfAccount(accountType);
		bankAccount.setBalanceInAccount(balanceInAccount);
		bankAccount.setNumberOfTransactions(0);

		listOfBankAccounts.add(bankAccount);

		System.out.println("\nBANK ACCOUNT SUCCESSFULLY CREATED...!");
	}

	public void displayAllAccounts() {
//		for (BankAccount bankDetails : listOfBankAccounts) {
//			System.out.println(bankDetails.toString());
//		}
		listOfBankAccounts.stream().forEach(System.out::print);
	}

	public void displaySpecificAccount() {
		System.out.print("\nEnter name or account number to display account details : ");
		String accountNumORName = input.next();

		for (BankAccount bankDetails : listOfBankAccounts) {
			if (bankDetails.getNameOfDepositor().contains(accountNumORName)
					|| bankDetails.getAccountNumber().contains(accountNumORName)) {
				System.out.println(bankDetails.toString());
			}
		}
	}

	public void editAddress() {
		System.out.print("\nEnter name or account number to display account details : ");
		String accountNumORName = input.next();

		for (BankAccount bankDetails : listOfBankAccounts) {
			if (bankDetails.getNameOfDepositor().contains(accountNumORName)
					|| bankDetails.getAccountNumber().contains(accountNumORName)) {
				System.out.print("\nEnter new address : ");
				String newAddress = input.next();

				bankDetails.setAddressOfDepositor(newAddress);
				System.out.println(bankDetails.toString());
				return;
			} else {
				continue;
			}
		}
	}

}
