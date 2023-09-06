package com.employees.employees.services.departmentservice;

import com.employees.employees.model.Department;
import com.employees.employees.repository.EmployeesDepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeesDepartmentServiceImpl implements EmployeesDepartmentService{
    EmployeesDepartmentRepository employeesDepartmentRepository;
    public EmployeesDepartmentServiceImpl(EmployeesDepartmentRepository employeesDepartmentRepository) {
        this.employeesDepartmentRepository = employeesDepartmentRepository;
    }

    @Override
    public String addDepartments(Department department) {
         this.employeesDepartmentRepository.save(department);
        return "Success";
    }

    @Override
    public String updateDepartment(Department department) {
         this.employeesDepartmentRepository.save(department);
        return "Success";
    }

    @Override
    public String deleteDepartment(Long departmentId) {
        this.employeesDepartmentRepository.deleteById(departmentId);
        return "Successfully deleted";
    }

    @Override
    public String deleteAllDepartments() {
        this.employeesDepartmentRepository.deleteAll();
        return "All Deleted";
    }
}
