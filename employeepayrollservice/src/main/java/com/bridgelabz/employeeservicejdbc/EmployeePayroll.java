package com.bridgelabz.employeeservicejdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class EmployeePayroll {
	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service"; // declare JdbcURL
		String UserName = "root";
		String Password = "Shiva@12";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // inbuilt method for Class.forName for loading driver
			System.out.println("Driver loaded");

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // for tracing the exception

		}
		listDrivers();
		try {
			System.out.println("Connecting to Database...:" + jdbcURL); // for loading the drive for connect
			Connection connection = DriverManager.getConnection(jdbcURL, UserName, Password); // creating object for
			// connection
			System.out.println("connection successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void listDrivers() {
		Enumeration<Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println(" " + driverClass.getClass().getName());
		}
	}
}
