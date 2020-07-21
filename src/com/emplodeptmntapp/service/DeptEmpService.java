package com.emplodeptmntapp.service;

import java.util.List;

import com.emplodeptmntapp.model.Department;
import com.emplodeptmntapp.model.Employee;

public interface DeptEmpService {
	
	//create a department
		boolean createDeptServ(Department dept);
		//update a department
		boolean updateDeptServ(Department dept);
		//Get All Department
	    List<Department> readAllDeptServ();
	    //delete department with all associated employees
	    boolean delteDeptServ(int deptId);
	    //Create Employee With Associate Department id
	    boolean createEmpServ(Employee employee);
	    //Update employee details with in department
	    boolean updateEmpServ(Employee employee);
	    // Get all employees based on department id
	    List<Employee> readEmpFromDeptServ(int empId);
	    //delete employee in department
	    boolean deleteEmpFromDeptServ(int deptId,int empId);
	    //reading employee record
	    Employee readEmployeeServ(int empId);
	    //reading department record
	    Department showDeptServ(int id);


}
