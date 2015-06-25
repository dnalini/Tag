package com.jdbc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO { private Connection con = null;
private Statement stmt;

public void insert(Employee emp) {
      String emp_Name = emp.getEmployeeName();
      long emp_Salary = emp.getEmployeeSalary();
      String emp_PhoneNumbers = emp.getEmployeePhoneNumbers();
      String emp_Address = emp.getEmployeeAddress();
      String emp_Department = emp.getEmployeeDepartment();

      try {
            con = DatabaseUtils.getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO employee(emp_name, emp_salary, emp_phone, emp_address, emp_department)"
                        + "VALUES('" + emp_Name + "'," + emp_Salary + ",'" + emp_PhoneNumbers + "','" + emp_Address + "','" + emp_Department + "')");
      } catch (SQLException e) {
            e.printStackTrace();
      }
}

public void update(int emp_id) {
      try {
            con = DatabaseUtils.getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE employee SET emp_address='San Chaung' WHERE emp_id= " + emp_id);
      } catch (SQLException e) {
            e.printStackTrace();
      }
}

public Employee findById(int emp_id) {
      List<Employee> empList = new ArrayList<Employee>();
      try {
            con = DatabaseUtils.getConnection();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM employee WHERE emp_id= "+ emp_id);
            while (resultSet.next()) {
                  int empId = resultSet.getInt("emp_id");
                  String empName = resultSet.getString("emp_name");
                  Long empSalary = resultSet.getLong("emp_salary");
                  String empPhone = resultSet.getString("emp_phone");
                  String empAddress = resultSet.getString("emp_address");
                  String empDept = resultSet.getString("emp_department");
                  empList.add(new Employee(empId, empName, empSalary, empPhone, empAddress, empDept));
            }
      } catch (SQLException e) {
            e.printStackTrace();
      }
      return empList.get(0);
}

public List<Employee> findAll() {
      List<Employee> empList = new ArrayList<Employee>();
      try {
            con = DatabaseUtils.getConnection();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM employee");
            while (resultSet.next()) {
                  int empId = resultSet.getInt("emp_id");
                  String empName = resultSet.getString("emp_name");
                  Long empSalary = resultSet.getLong("emp_salary");
                  String empPhone = resultSet.getString("emp_phone");
                  String empAddress = resultSet.getString("emp_address");
                  String empDept = resultSet.getString("emp_department");
                  empList.add(new Employee(empId, empName, empSalary, empPhone, empAddress, empDept));
            }
      } catch (SQLException e) {
            e.printStackTrace();
      }
      return empList;
}

public void delete(int emp_id) {
      try {
            con = DatabaseUtils.getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM employee WHERE emp_id=" + emp_id);
      } catch (SQLException e) {
            e.printStackTrace();
      }
}}
