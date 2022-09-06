package com.api.apicrudoperation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long employeeId;
    private String employeeName;
    private String course;

}
