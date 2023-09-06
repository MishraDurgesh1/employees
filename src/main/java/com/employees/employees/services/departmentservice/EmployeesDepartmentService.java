package com.employees.employees.services.departmentservice;

import com.employees.employees.model.Department;
import org.springframework.stereotype.Service;

public interface EmployeesDepartmentService {

    //Add Employee Details with POST
    public String addDepartments(Department department);

    //Update Employee Details with PUT
    public String updateDepartment(Department department);

    //Delete an Employee Details with DELETE
    public String deleteDepartment(Long departmentId);

    //Delete All Employees Details with DELETE
    public String deleteAllDepartments();

}
