package com.jdbc.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class EmployeeDAOTest {

    private EmployeeDAO empDao = new EmployeeDAO();

    public void insertEmployee() throws IOException {
    	  System.out.println("inserting new record...");
    	  InputStreamReader r=new InputStreamReader(System.in);  
    	  
    	  BufferedReader br=new BufferedReader(r);  
    	  System.out.println("Enter your name");  
    	  String employeeName = br.readLine(); 
    	  
    	  System.out.println("Enter your mobile number");  
    	  String employeePhoneNumbers = br.readLine();
    	  
    	  System.out.println("Enter your address");  
    	  String employeeAddressm = br.readLine();  
    	  
    	  System.out.println("Enter your department");  
    	  String employeeDepartment = br.readLine();  
    	  
    	  System.out.println("Enter your sal"); 
    	  long employeeSalary = br.read(); 
    	  
          Employee empObj = new Employee(employeeName, employeeSalary, employeePhoneNumbers, employeeAddressm, employeeDepartment);
          empDao.insert(empObj);
    }

    public void updateEmployee() throws IOException {
    	  System.out.println("updating  record...");
    	  InputStreamReader r=new InputStreamReader(System.in);  
    	  BufferedReader br=new BufferedReader(r);  
    	  System.out.println("Enter id");  
    	  int emp_id = br.read(); 
    	  
          empDao.update(emp_id);
    }

    public void findEmployee() throws IOException {
    	  System.out.println("retrieve  record...");
    	  InputStreamReader r=new InputStreamReader(System.in);  
    	  BufferedReader br=new BufferedReader(r);  
    	  System.out.println("Enter your id");  
    	  int emp_id = br.read(); 
          Employee emp = empDao.findById(emp_id);
          System.out.println("Employee Id : " + emp.getEmployeeId());
          System.out.println("Employee Name : " + emp.getEmployeeName());
          System.out.println("Employee Salary : " + emp.getEmployeeSalary());
          System.out.println("Employee Phone : " + emp.getEmployeePhoneNumbers());
          System.out.println("Employee Address : " + emp.getEmployeeAddress());
          System.out.println("Employee Department : " + emp.getEmployeeDepartment());
    }
    
    public void searchEmployees() throws IOException {
  	 
    	List<Employee> empList  = empDao.searchEmployees();
    	for (Employee emp : empList) {
    		 System.out.println("Employee Id : " + emp.getEmployeeId());
    	        System.out.println("Employee Name : " + emp.getEmployeeName());
    	        System.out.println("Employee Salary : " + emp.getEmployeeSalary());
    	        System.out.println("Employee Phone : " + emp.getEmployeePhoneNumbers());
    	        System.out.println("Employee Address : " + emp.getEmployeeAddress());
    	        System.out.println("Employee Department : " + emp.getEmployeeDepartment());
		}
       
  }

    public void deleteEmployee() throws IOException {
		System.out.println("deleting record...");
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter your id");
		int emp_id = br.read();
		empDao.delete(emp_id);
    }

    public static void main(String[] args) throws IOException {
          EmployeeDAOTest empTest = new EmployeeDAOTest();
          empTest.insertEmployee();
         /* empTest.updateEmployee();
          empTest.findEmployee();
          empTest.deleteEmployee();
          empTest.searchEmployees();*/
    }

}
