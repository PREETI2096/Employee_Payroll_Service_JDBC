package com.bridgelabz.employeeservicejdbc;

public class EmployeeCustomException extends Exception {
	 public EmployeeCustomException(String Invalid_Input)
	    {
	        super(Invalid_Input);
	    }
}