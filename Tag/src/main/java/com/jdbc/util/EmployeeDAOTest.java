package com.jdbc.util;

public class EmployeeDAOTest {

    private EmployeeDAO empDao = new EmployeeDAO();

    public void insertEmployee() {
          Employee empObj = new Employee("ZTO", 200000, "099 2560 147", "Yangon", "Metadata");
          empDao.insert(empObj);
    }

    public void updateEmployee() {
          empDao.update(4);
    }

    public void findEmployee() {
          Employee emp = empDao.findById(1);
          System.out.println("Employee Id : " + emp.getEmployeeId());
          System.out.println("Employee Name : " + emp.getEmployeeName());
          System.out.println("Employee Salary : " + emp.getEmployeeSalary());
          System.out.println("Employee Phone : " + emp.getEmployeePhoneNumbers());
          System.out.println("Employee Address : " + emp.getEmployeeAddress());
          System.out.println("Employee Department : " + emp.getEmployeeDepartment());
    }

    public void deleteEmployee() {
          empDao.delete(3);
    }

    public static void main(String[] args) {
          EmployeeDAOTest empTest = new EmployeeDAOTest();
          empTest.insertEmployee();
          empTest.updateEmployee();
          empTest.findEmployee();
          empTest.deleteEmployee();
    }

}
