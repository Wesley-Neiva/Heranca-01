package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Bob", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new BusinessAccount(1004, "Anna", 0.0, 100.0);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if (acc3 instanceof BusinessAccount) {
		BusinessAccount acc5 = (BusinessAccount)acc3;
		acc5.loan(200.0);
		System.out.println("Loan!");
		}
		
		
		if (acc3 instanceof SavingAccount) {
		SavingAccount acc5 = (SavingAccount)acc3;
		acc5.updateBalance();
		System.out.println("Update!");
		}
		
		Account acc6 = new SavingAccount(1008, "Rafael", 500.00, 0.0);
		acc6.withdraw(200);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new BusinessAccount(1010, "Wesley", 1000.0, 0.0);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new Account(1111, "Zéca", 5000.0);
		acc8.withdraw(200);
		System.out.println(acc8.getHolder());
		System.out.println(acc8.getNumber());
		System.out.println(acc8.getBalance());

	}

}
