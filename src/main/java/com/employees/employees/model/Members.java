package com.employees.employees.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Members")
public class Members extends Auditable{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmployeeId;
    private String EmployeeName;
    private String Password;
    private String Gender;
    private String EmployeeDepartment;
    private String EmployeeDesignation;
    private String ReportingManager;
    private String JoiningDate;
}
