package com.colvir.szasemkov.homework1.model.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "employees")
@Builder(setterPrefix = "set")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_employee")
    @SequenceGenerator(name = "seq_employee", sequenceName = "seq_employee", allocationSize = 1)
    private Integer id;

    private String firstName;

    private String lastName;

    private Integer salary;

    private String department;

    public Employee(String firstName, String lastName, Integer salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }
}
