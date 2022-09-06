package com.api.apicrudoperation;

import java.util.List;

public interface EmployeeService {
    EmployeeDetails addEmployee(EmployeeDetails employeeDetails);

    List<EmployeeDetails> getData();

    EmployeeDetails getById(long employeeId);
    EmployeeDetails updateIyId(long employeeId,EmployeeDetails employeeDetails);
    String deleteById(long employeeId);
}
