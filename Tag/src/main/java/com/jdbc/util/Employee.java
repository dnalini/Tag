package com.jdbc.util;

public class Employee {
	private int employeeId;
    private String employeeName;
    private long employeeSalary;
    private String employeePhoneNumbers;
    private String employeeAddress;
    private String employeeDepartment;
    
    public Employee() {
    }

    public Employee(String emp_name, long emp_salary, String emp_phone, String emp_address, String emp_dept) {
          this.employeeName = emp_name;
          this.employeeSalary = emp_salary;
          this.employeePhoneNumbers = emp_phone;
          this.employeeAddress = emp_address;
          this.employeeDepartment = emp_dept;
    }

    public Employee(int emp_id, String emp_name, long emp_salary, String emp_phone, String emp_address, String emp_dept) {
          this.employeeId = emp_id;
          this.employeeName = emp_name;
          this.employeeSalary = emp_salary;
          this.employeePhoneNumbers = emp_phone;
          this.employeeAddress = emp_address;
          this.employeeDepartment = emp_dept;
    }
    
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeePhoneNumbers() {
		return employeePhoneNumbers;
	}
	public void setEmployeePhoneNumbers(String employeePhoneNumbers) {
		this.employeePhoneNumbers = employeePhoneNumbers;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
    
}
