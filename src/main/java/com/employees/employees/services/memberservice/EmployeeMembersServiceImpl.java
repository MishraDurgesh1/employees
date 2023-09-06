package com.employees.employees.services.memberservice;

import com.employees.employees.model.Members;
import com.employees.employees.repository.EmployeesMembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMembersServiceImpl implements EmployeesMembersService {
    @Autowired
    EmployeesMembersRepository employeesMembersRepository;

    public EmployeeMembersServiceImpl(EmployeesMembersRepository employeesMembersRepository) {
        this.employeesMembersRepository = employeesMembersRepository;
    }

    @Override
    public String addEmployees(Members members) {
         this.employeesMembersRepository.save(members);
         return "Success";
    }

    @Override
    public String updateEmployees(Members members) {
         this.employeesMembersRepository.save(members);
         return "Success";
    }

    @Override
    public String deleteEmployees(Long employeeId) {
        this.employeesMembersRepository.deleteById(employeeId);
        return "Successfully Deleted";
    }

    @Override
    public String deleteAllMembers() {
        this.employeesMembersRepository.deleteAll();
        return "All Deleted";
    }
}
