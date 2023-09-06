package com.employees.employees.repository;

import com.employees.employees.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesDepartmentRepository extends JpaRepository<Department,Long> {

}
