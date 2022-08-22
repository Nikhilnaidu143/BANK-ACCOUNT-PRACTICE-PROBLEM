package com.practice;

/***
 * 
 * @author nikhils4
 *
 *         Lets create a bank account. Create a class named 'BankAccount' with
 *         the following data members 
 *         1 - Name of depositor 
 *         2 - Address of depositor 
 *         3 - Type of account 
 *         4 - Balance in account 
 *         5 - Number of
 *         transactions Class 'BankAccount' has a method for each of the
 *         following 
 *         1 - Generate a unique account number for each depositor For
 *         first depositor, account number will be BA1000, for second depositor
 *         it will be BA1001 and so on 
 *         2 - Display information and balance of
 *         depositor 
 *         3 - Deposit more amount in balance of any depositor 
 *         4 - Withdraw some amount from balance deposited 
 *         5 - Change address of
 *         depositor After creating the class, do the following operations 
 *         1 - 
 *         Enter the information (name, address, type of account, balance) of
 *         the depositors. Number of depositors are to be entered by user. 
 *         2 -
 *         Print the information of any depositor. 
 *         3 - Add some amount to the
 *         account of any depositor and then display final informaion of that
 *         depositor 
 *         4 - Remove some amount from the account of any depositor
 *         and then display final informaion of that depositor 
 *         5 - Change the
 *         address of any depositor and then display the final information of
 *         that depositor 
 *         6 - Randomly repeat these processes for some other
 *         bank accounts and after that print the total number of transactions.
 */

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccountService bankAccountService = new BankAccountService();
		DepositOrWithdraw depositOrWithdraw = new DepositOrWithdraw();

		System.out.print("ENTER 1)ENTER or 2)EXIT : ");
		int enterExit = BankAccountService.input.nextInt();

		if (enterExit == 1) {
			while (enterExit != 2) {
				System.out.println("\nCHOOSE WHICH OPERATION YOU WANT TO PERFORM... \n" + "1.Add Bank Account" + "\n"
						+ "2.Display All Bank Accounts" + "\n" + "3.Display Specific Bank Account" + "\n"
						+ "4.Edit Address" + "\n" + "5.Deposit Amount" + "\n" + "6.Withdraw Amount" + "\n"
						+ "7.Exit Application" + " : ");
				int choice = BankAccountService.input.nextInt();
				switch (choice) {
				case 1:
					bankAccountService.addBankAccount();
					break;
				case 2:
					bankAccountService.displayAllAccounts();
					break;
				case 3:
					bankAccountService.displaySpecificAccount();
					break;
				case 4:
					bankAccountService.editAddress();
					break;
				case 5:
					depositOrWithdraw.depositAmount();
					break;
				case 6:
					depositOrWithdraw.WithdrawAmount();
					break;
				default:
					System.out.print("\nPLEASE CHOOSE VALID OPTIONS...!");
				}
				if (choice == 7) {
					System.out.print("\nSUCCESSFULLY EXITED...!");
					break;
				}
			}
		} else if (enterExit == 2) {
			System.out.print("\nSUCCESSFULLY EXITED...!");
		} else {
			System.out.print("\nENTER VALID OPTIONS...!");
		}
		BankAccountService.input.close();
	}

}
