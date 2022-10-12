package com.infinite.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccount {
public static void main(String[] args) {
	int accountNo;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter AccountNo ");
	accountNo = sc.nextInt();
	BankDAO dao = new  BankDAO();
	try {
		Bank bank = dao.searchAccount(accountNo);
		System.out.println(bank);
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		
	}
}
}
