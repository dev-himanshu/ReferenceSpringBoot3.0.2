package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sp_employee_table")
public class Employee {
    @Id
    private Integer empId;
    private String empName;
    private String empDesg;
    private String empDept;
    private Double empSal;
}
