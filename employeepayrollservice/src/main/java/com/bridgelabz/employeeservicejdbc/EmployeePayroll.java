package com.bridgelabz.employeeservicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeePayroll {
	public static void CreatedConnection() {
		try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
                    "Shiva@12");

			String s = "select * from employee_payroll";
			PreparedStatement ps = conn.prepareStatement(s);
			ResultSet result = ps.executeQuery();

			while (result.next()) {
				int Id = result.getInt(1);
				String Name = result.getString(2);
				Double Salary = result.getDouble(3);
				String Start_Date = result.getString(4);
				String Gender = result.getString(5);
				System.out.println("id- " + Id + " Name:- " + Name + " | " + " Salary:- " + Salary
						+ " Date:- " + Start_Date+" Gender:- " + Gender );
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		CreatedConnection();
	}
}
