package com.infinite.jdb.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class EmployDelete {
public static void main(String[] args){
	int empno;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employe no");
	empno=sc.nextInt();
	try{
		
		try{
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/infinite","root","india@123");
			
		}
	}
}
}
