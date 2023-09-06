package com.employees.employees.services.memberservice;

import com.employees.employees.model.Members;

public interface EmployeesMembersService {
    //Add Employee Details with POST
   public String addEmployees(Members members);

    //Update Employee Details with PUT
    public String updateEmployees(Members members);

    //Delete an Employee Details with DELETE
   public String deleteEmployees(Long employeeId);

    //Delete All Employees Details with DELETE
    public String deleteAllMembers();
}
