package com.bridgelabz.employeeservicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeePayroll {
	public static void CreatedConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
					"Shiva@12");
			Statement st = conn.createStatement();
			st.execute("select sum(Salary) from employee_payroll");
			st.execute("select avg(Salary) from employee_payroll");
			st.execute("select min(Salary) from employee_payroll");
			st.execute("select count(Salary) from employee_payroll");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		CreatedConnection();
	}
}
