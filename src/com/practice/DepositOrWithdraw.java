package com.practice;

public class DepositOrWithdraw {

	public void depositAmount() {
		System.out.print("\nEnter name or account number to deposit : ");
		String accountNumORName = BankAccountService.input.next();

		for (BankAccount bankDetails : BankAccountService.listOfBankAccounts) {
			if (bankDetails.getNameOfDepositor().contains(accountNumORName)
					|| bankDetails.getAccountNumber().contains(accountNumORName)) {
				System.out.print("\nEnter amount to deposit : ");
				double amount = BankAccountService.input.nextDouble();
				bankDetails.setBalanceInAccount(bankDetails.getBalanceInAccount() + amount);
				bankDetails.setNumberOfTransactions(bankDetails.getNumberOfTransactions() + 1);

				System.out.print("\n" + bankDetails.toString());
			}
		}
	}

	public void WithdrawAmount() {
		System.out.print("\nEnter name or account number to deposit : ");
		String accountNumORName = BankAccountService.input.next();

		for (BankAccount bankDetails : BankAccountService.listOfBankAccounts) {
			if (bankDetails.getNameOfDepositor().contains(accountNumORName)
					|| bankDetails.getAccountNumber().contains(accountNumORName)) {
				System.out.print("\nEnter amount to withdraw : ");
				double amount = BankAccountService.input.nextDouble();

				if (bankDetails.getBalanceInAccount() < amount) {
					System.out.print("\nOOPS! Blanace available : " + bankDetails.getBalanceInAccount());
					return;
				} else {
					bankDetails.setBalanceInAccount(bankDetails.getBalanceInAccount() - amount);
					bankDetails.setNumberOfTransactions(bankDetails.getNumberOfTransactions() + 1);
					System.out.print("\n" + bankDetails.toString());
				}
			}
		}
	}

}
