package com.employees.employees.controller;

import com.employees.employees.model.Department;
import com.employees.employees.model.Members;
import com.employees.employees.services.departmentservice.EmployeesDepartmentService;
import com.employees.employees.services.memberservice.EmployeesMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    private final EmployeesMembersService employeesMembersService;
    private final EmployeesDepartmentService employeesDepartmentService;

    @Autowired
    public EmployeesController(
            EmployeesMembersService employeesMembersService,
            EmployeesDepartmentService employeesDepartmentService
    ) {
        this.employeesMembersService = employeesMembersService;
        this.employeesDepartmentService = employeesDepartmentService;
    }

    //API Methods for Members:-
    @PostMapping("/members")
    public String addMemberEmployeesDetails(@RequestBody Members members) {
        this.employeesMembersService.addEmployees(members);
        return "Successfully Created Member";
    }

    @PutMapping("/members/{EmployeeId}")
    public String updateMemberEmployee(@RequestBody Members members) {
         this.employeesMembersService.updateEmployees(members);
         return "Successfully updated";
    }

    @DeleteMapping("/members/delete/{EmployeeId}")
    public String deleteMember(@PathVariable ("EmployeeId") Long employeeId) {
        this.employeesMembersService.deleteEmployees(employeeId);
        return "Delete Selected Member";
    }

    @DeleteMapping("/members/delete")
    public String deleteAllMembers() {
        this.employeesMembersService.deleteAllMembers();
        return "Deleted All Members";
    }

    //API Methods for Department:-
    @PostMapping("/department")
    public String addDepartmentDetails(@RequestBody Department department) {
         this.employeesDepartmentService.addDepartments(department);
         return "Successfully added Department";
    }

    @PutMapping("/department/{DepartmentId}")
    public String updateDepartment(
            @PathVariable String DepartmentId,
            @RequestBody Department department) {
                this.employeesDepartmentService.updateDepartment(department);
                return "Successfully updated Department";
    }

    @DeleteMapping("/department/delete/{DepartmentId}")
    public String deleteDepartment(@PathVariable("DepartmentId") Long departmentId) {
        this.employeesDepartmentService.deleteDepartment(departmentId);
        return "Delete";
    }

    @DeleteMapping("/department/delete")
    public String deleteAllDepartments() {
        this.employeesDepartmentService.deleteAllDepartments();
        return "ALL DELETED";
    }
}
