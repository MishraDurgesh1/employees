package com.employees.employees.repository;

import com.employees.employees.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "/employee")
public interface EmployeesMembersRepository extends JpaRepository<Members,Long> {
}
